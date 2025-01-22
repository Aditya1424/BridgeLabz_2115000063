import java.util.*;

public class fee {
    public static void main(String[] args) {
        
        Scanner adi = new Scanner(System.in);

        double fee= adi.nextDouble();
        double discount_perc = adi.nextDouble();

        double discount = (fee*discount_perc)/100;

        double discounted_fee = fee-discount;

        
        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + discounted_fee);
    }
}
