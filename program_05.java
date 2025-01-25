import java.util.*;

public class program_05{
    public static void main(String[] args) {
        
        Scanner adi = new Scanner(System.in);
        int num= adi.nextInt();

        for (int i =6;i<= 9;i++) {
            for (int j =1;j<=10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
