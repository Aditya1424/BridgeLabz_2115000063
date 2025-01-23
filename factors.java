import java.util.*;
public class factors{
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        int num= adi.nextInt();
        int greatestFactor= 1;

        for (int i = num-1;i>0;i--){
            if (num% i ==0){
                greatestFactor =i;
                break;
            }
        }

        System.out.println("Greatest factor: " +greatestFactor);
    }
}
