import java.util.*;

public class area_of_triangle {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);

        
        double base = adi.nextDouble();
		double height = adi.nextDouble();
        
		double areaInInches = 0.5 * base *height;
        double areaInCm = areaInInches*6.4516;
        
		System.out.println("The area of the triangle in square inches is " + areaInInches);
        System.out.println("The area of the triangle in square centimeters is " + areaInCm);

    }
}
