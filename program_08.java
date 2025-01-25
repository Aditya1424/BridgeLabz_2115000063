import java.util.*;
public class program_08{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int num= adi.nextInt();
        int a[]= new int[num];
        int idx= 0;
        for (int i =1;i<=num;i++) {
            if (num% i== 0) {
                a[idx++] =i;
            }
        }
        
        System.out.println("Factors: " + Arrays.toString(Arrays.copyOf(a, idx)));
    }
}
