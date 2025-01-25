import java.util.*;
public class program_10{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int num= adi.nextInt();

        if (num<= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        String res[] = new String[num+1];
        for (int i = 1;i<=num;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0) {
                res[i] = "Fizz";
            } 
            else if (i % 5 == 0) {
                res[i] = "Buzz";
            } 
            else {
                res[i] = Integer.toString(i);
            }
        }

        for (int i = 1;i<=num; i++) {
            System.out.println("Position "+i+ " = " + res[i]);
        }
    }
}
