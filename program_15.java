import java.util.*;
public class program_15{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int num= adi.nextInt();
        int c= 0;
        int temp=num;
        while (temp!= 0) {
            c++;
            temp/= 10;
        }
        
        int a[]= new int[c];
        for (int i =c-1; i>=0;i--) {
            a[i]= num% 10;
            num/= 10;
        }
        
        for (int i =c-1; i>=0;i--) {
            System.out.print(a[i] + " ");
        }
    }
}
