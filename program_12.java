import java.util.*;
public class program_12{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int a[]=new int[3];
        double b[] =new double[3];
        for (int i =0;i < 3;i++) {
            a[i] =adi.nextInt();
            b[i] = adi.nextDouble();
        }
        int youngestIndex =0;
        int tallestIndex =0;

        for (int i = 1;i<3; i++) {
            if (a[i] < a[youngestIndex]) youngestIndex = i;
            if (b[i] >b[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest friend is friend: " + (youngestIndex +1));
        System.out.println("Tallest friend is friend: " + (tallestIndex +1));
    }
}
