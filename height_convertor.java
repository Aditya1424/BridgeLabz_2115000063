import java.util.*;

public class height_convertor {
    public static void main(String[] args) {
        
        Scanner adi = new Scanner(System.in);
		
		double height_cm = adi.nextInt();
		
		double height_inches= height_cm/ 2.54;
		double height_foot = height_inches/12;
		
		System.out.println("Foot: "+height_foot+ " Inches: "+height_inches);
	}
}
		