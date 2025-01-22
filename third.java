import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int number1 = adi.nextInt();
        int number2 = adi.nextInt();
        int number3 = adi.nextInt();

        System.out.println("Is the first number the largest: " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest: " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest: " + (number3 > number1 && number3 > number2));
    }
}
