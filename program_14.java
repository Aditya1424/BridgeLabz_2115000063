import java.util.*;
public class program_14{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int num= adi.nextInt();
        int a[]= new int[10];
        int maxDigit =10, index = 0;
        while (num!= 0) {
            if (index== maxDigit) {
                maxDigit +=10;
                int temp[] =new int[maxDigit];
                System.arraycopy(a, 0,temp,0,a.length);
                a= temp;
            }
            a[index++] = num% 10;
            num/= 10;
        }
       int largest = 0, secondLargest = 0;
        for (int i = 0; i< index; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest =a[i];
            } 
            else if (a[i] > secondLargest) {
                secondLargest =a[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}

