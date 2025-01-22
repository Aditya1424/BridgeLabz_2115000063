import java.util.*;

public class temperature_2 {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		double fah = adi.nextDouble();
	
		double cel= (fah-32)*5/9;
		
        System.out.println(cel);
	}
}