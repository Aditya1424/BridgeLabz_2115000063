import java.util.*;

public class km_to_miles {
    public static void main(String[] args) {
        
        Scanner adi = new Scanner(System.in);
        double km = adi.nextDouble();
		double miles = km/1.6;

		System.out.println("The total miles is " + miles + " miles for the given " + km + " km");


    }
}
