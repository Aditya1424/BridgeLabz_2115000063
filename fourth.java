import java.util.*;

public class fourth {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num= adi.nextInt();

        if (num> 0) {
            int sum = (num*(num+1))/2;
            System.out.println("The sum of " + num+ " natural numbers is: " + sum);
        } else {
            System.out.println("The number " + num+ " is not a natural number.");
        }
    }
}
