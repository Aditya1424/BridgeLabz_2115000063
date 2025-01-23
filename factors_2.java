import java.util.*;
public class factors_2 {
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int num =adi.nextInt();
        for (int i = 1; i<= num;i++) {
            if (num%i == 0) {
                System.out.println(i);
            }
        }
    }
}
