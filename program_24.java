import java.util.*;
public class program_24{   
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        double temp =adi.nextDouble();
        int choice= adi.nextInt();

        if (choice ==1) {
            System.out.println(temp + " Fahrenheit is " + fahrenheitToCelsius(temp) + " Celsius");
        }
		else if (choice ==2) {
            System.out.println(temp + " Celsius is " + celsiusToFahrenheit(temp) + " Fahrenheit");
        } 
		else {
            System.out.println("Invalid choice");
        }
    }
}
