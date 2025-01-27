import java.util.*;
public class program_27{
    public static void main(String []args){
        Scanner adi= new Scanner(System.in);
        int n= adi.nextInt();
        if(formula(n)== recursive(n)){
            System.out.println("Same: "+formula(n));
        }
        else{
            System.out.println("Not same");
        }
        
        
    }
    public static int formula(int n){
        int res= (n*(n+1))/2;
        return res;
    }
    
    public static int recursive(int n){
        if(n==1){
            return 1;
        }
        int sum=0;
        sum=n+recursive(n-1);
        
        return sum;
    }
}