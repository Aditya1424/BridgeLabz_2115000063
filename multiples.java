import java.util.*;
public class multiples{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num=adi.nextInt();

        for (int i=1;i<100;i++) {
            if (i%num== 0) {
                System.out.println(i);
            }
        }
    }
}
