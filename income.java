import java.util.*;

public class income {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);

        double salary =adi.nextDouble();

        double bonus =adi.nextDouble();
		double total_Income =salary+bonus;

        System.out.println("The salary: " + salary + " and bonus: " + bonus + " Total Income: " + total_Income);
    }
}
