import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("A1","WagyuBeef",500);
        Product product2 = new Product("A2","KuromoBeef",470);
        Product product3 = new Product("A3","USBeef",400);
        Product product4 = new Product("A4","VNBeef",300);
        Product product5 = new Product("A5","KobeBeef",600);

        ProductManager products = new ProductManager();
        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);
        products.addProduct(product4);
        products.addProduct(product5);
        products.display();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter ID to Change Product: ");
//        String inputIdToChange = sc.nextLine();
//        products.reProduct(inputIdToChange);
//        products.display();
//
//        System.out.println("Enter ID to Delete Product: ");
//        String inputIdToDel = sc.nextLine();
//        products.deleteProduct(inputIdToDel);
//        products.display();
  //      System.out.println("Enter Name Product: ");
  //     String inputNameProduct = sc.nextLine();
  //     products.findProduct(inputNameProduct);
        System.out.println("After sort By Price Up");
        products.sortProductByPriceUp(products);
        products.display();
    }
}
