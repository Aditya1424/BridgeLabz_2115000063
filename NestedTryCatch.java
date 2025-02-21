import java.util.*;
public class NestedTryCatch {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        int divisor = scanner.nextInt();

        try {
            int element = array[index];
            try {
                int result = element / divisor;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } 
    }
}