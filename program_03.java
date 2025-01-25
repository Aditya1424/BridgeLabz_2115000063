import java.util.*;
public class program_03{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num= adi.nextInt();
        int a[]= new int[10];

        for(int i=1;i<=10;i++) {
            a[i-1] =num*i;
        }
        for(int i=1;i<=10;i++) {
            System.out.println(num+ " * " + i + " = " +a[i-1]);
        }
    }
}