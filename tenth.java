import java.util.*;

public class tenth {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);

        double sum= 0;

        while (true){
            double num= adi.nextDouble();

            if (num== 0) {
                break;
            }

            sum+= num;
        }

        System.out.println(sum);
    }
}
