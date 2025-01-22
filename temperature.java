import java.util.*;

public class temperature {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		double cel = adi.nextDouble();
		
		double fah= (cel*9/5)+32;
		
        System.out.println(fah);
	}
}