import java.util.*;
public class program_22{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int n= adi.nextInt();
        
        System.out.println(Factorial(n));
    }
    
    public static int Factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        
        return n*Factorial(n-1);
    }
}
