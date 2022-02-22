import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager extends Product  {
    public ArrayList<Product> products = new ArrayList<>();
    public ProductManager() {
    }

    public ProductManager(String productId, String productName, double productPrice) {
       super(productId, productName, productPrice);
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void reProduct(String id){
        Scanner sc = new Scanner(System.in);
            if (checkProductById(id)){
                   System.out.println("Enter Product ID,Name,Price:");
                    String newId = sc.nextLine();
                    String newName = sc.nextLine();
                    double newPrice = sc.nextDouble();
                    products.get(getIndexById(id)).setProductId(newId);
                    products.get(getIndexById(id)).setProductName(newName);
                    products.get(getIndexById(id)).setProductPrice(newPrice);
            } else System.out.println("There is no ID");
    }
    public void deleteProduct(String id){
        if (checkProductById(id)){
            products.remove(getIndexById(id));
        } else System.out.println("There is no ID");
    }
    public void display(){
        for (Product p : products){
            System.out.println(p.toString()+" ");
        }
    }
    public void findProduct(String name) {
        if (checkProductByName(name)){
            System.out.println(products.get(getIndexByName(name)));
        } else System.out.println("Not found");
    }

    public boolean checkProductById(String id){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(id)){
                return true;
            }
        } return false;
    }
    public boolean checkProductByName(String name){
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getProductName().equals(name)){
                return true;
            }
        } return false;
    }
    public int getIndexById(String id){
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (id.equals(products.get(i).getProductId())){
                index = i;
            }
        } return index;
    }
    public int getIndexByName(String name){
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getProductName())){
                index = i;
            }
        } return index;
    }
    public Product sortProductByPriceUp(ProductManager list){
        products.sort(Comparator.comparingDouble(o -> o.getProductPrice()));
        return list;
    }

}


