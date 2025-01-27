import java.util.*;

public class program_31{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int op = adi.nextInt();
        switch (op) {
            case 1:
                double fahrenheit =adi.nextDouble();
                System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;

            case 2:
                double celsius =adi.nextDouble();
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;

            case 3:
                double pounds =adi.nextDouble();
                System.out.println("Kilograms: " + poundsToKilograms(pounds));
                break;

            case 4:
                double kilograms =adi.nextDouble();
                System.out.println("Pounds: " +kilogramsToPounds(kilograms));
                break;

            case 5:
                double gallons =adi.nextDouble();
                System.out.println("Liters: " +gallonsToLiters(gallons));
                break;

            case 6:
                double liters= adi.nextDouble();
                System.out.println("Gallons: " +litersToGallons(liters));
                break;
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit- 32) * 5/9;
    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius *9 /5) +32;
    }

    public static double poundsToKilograms(double pounds){
        return pounds *0.453592;
    }

    public static double kilogramsToPounds(double kilograms){
        return kilograms *2.20462;
    }

    public static double gallonsToLiters(double gallons){
        return gallons *3.78541;
    }

    public static double litersToGallons(double liters){
        return liters*0.264172;
    }
}

