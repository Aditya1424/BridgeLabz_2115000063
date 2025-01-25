import java.util.*;
public class program_20{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num= adi.nextInt();
        int a[]= new int[10];
        int index=0;

        while (num!= 0) {
            a[index++] = num% 10;
            num/= 10;
        }
        int freq[]= new int[10];
        for (int i = 0; i<index; i++) {
            freq[a[i]]++;
        }
        for (int i = 0; i <10; i++) {
            if (freq[i]> 0) {
                System.out.println(i + "\t" + freq[i]);
            }
        }
    }
}
