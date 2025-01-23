import java.util.*;
public class prime{
	public static void main(String []args){
		Scanner adi =new Scanner(System.in);
        int num= adi.nextInt();

        boolean isPrime = true;

        if (num<= 1) {
            isPrime = false;
        } 
		else {
            for (int i = 2; i < num;i++){
                if (num% i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }
		else {
            System.out.println(number + " is not a prime number.");
        }
	}
}