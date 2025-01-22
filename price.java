import java.util.*;

public class price {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		double unitPrice = adi.nextDouble();
        
        int quantity = adi.nextInt();
        double totalPrice = unitPrice *quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
	}
}