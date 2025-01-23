import java.util.*;
public class power{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int num =adi.nextInt();
        int power=adi.nextInt();

        int result= 1;

        for (int i =1;i<= power;i++) {
            result *= num;
        }

        System.out.println("Result: " +result);
    }
}
