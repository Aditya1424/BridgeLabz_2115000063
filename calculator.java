import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);

        
        double n1 = adi.nextDouble();

        
        double n2 = adi.nextDouble();

        double addition = n1 +n2;
        double subtraction = n1 -n2;
        double multiplication = n1 *n2;
        double division = n1/n2;

        System.out.println("The addition, subtraction, multiplication, and division of the numbers " 
                + n1 + " and " + n2 + " are " 
                + addition + ", " + subtraction + ", " 
                + multiplication + ", and " + division);

    }
}
