
import java.util.*;

public class Product{
    static double discount =10.0;
    
    String productName;
    double price;
    int quantity;
    int productID;
    
    public Product(String productName, double price, int quantity, final int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    
    public void display() {
        System.out.println("Product Name: "+ productName);
        System.out.println("Price: " +price);
        System.out.println("Quantity: " +quantity);
        System.out.println("Product ID: " +productID);
        System.out.println("Discount: " +discount + "%");
    }
    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        
        String productName = adi.nextLine();
        double price = adi.nextDouble();
        int quantity = adi.nextInt();
        int productID = adi.nextInt();
        
        Product product = new Product(productName, price, quantity, productID);
        
        if (product instanceof Product) {
            product.display();
        }
        
        System.out.println("Enter new discount percentage: ");
        double newDiscount = adi.nextDouble();
        updateDiscount(newDiscount);
        System.out.println("Updated Discount: " + discount + "%");
    }
}

