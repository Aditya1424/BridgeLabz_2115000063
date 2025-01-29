import java.util.*;
public class program_23{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num1= adi.nextInt();
        int num2 =adi.nextInt();
        
        int gcd =findGCD(num1,num2);
        int lcm =findLCM(num1,num2,gcd);
        
        System.out.println("GCD: " +gcd);
        System.out.println("LCM: " +lcm);
    }
    
    public static int findGCD(int a, int b) {
        while (b!= 0) {
            int temp = b;
            b = a % b;
            a= temp;
        }
        return a;
    }
    
    public static int findLCM(int a, int b, int gcd) {
        return (a*b)/gcd;
    }
}