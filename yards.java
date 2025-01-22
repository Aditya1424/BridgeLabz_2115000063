import java.util.*;

public class yards {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);

        double distanceInFeet = adi.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
		
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles");
	}
}