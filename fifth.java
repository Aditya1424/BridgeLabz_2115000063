import java.util.*;

public class fifth {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int age= adi.nextInt();

         if (age >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }

    }
}