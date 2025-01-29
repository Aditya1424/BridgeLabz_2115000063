import java.util.*;
public class program_25{
    public static double add(double a, double b) {
        return a+b;
    }
    
    public static double subtract(double a, double b) {
        return a-b;
    }
    
    public static double multiply(double a, double b) {
        return a*b;
    }
    
    public static double divide(double a, double b) {
        if (b ==0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        double num1 = adi.nextDouble();
        double num2 = adi.nextDouble();
        int choice = adi.nextInt();

        switch(choice){
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
        }
    }
}
