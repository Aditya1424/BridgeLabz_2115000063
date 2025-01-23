import java.util.*;
public class fizzbuzz_2 {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        int num =adi.nextInt();

        int i=1;
        while (i <= num) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
			else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
			else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
			else {
                System.out.println(i);
            }
			
            i++;
        }
    }
}
