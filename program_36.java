import java.util.*;
public class program_36{
    public static void main(String []args){
        Scanner adi= new Scanner(System.in);
        int a= adi.nextInt();
        int b= adi.nextInt();
        int c= adi.nextInt();
        
        int roots[]= quadratic(a,b,c);
        
       if (roots.length == 2) {
            System.out.println("Two roots: " +roots[0] + " and " +roots[1]);
        } 
        else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } 
        
    }
    public static int[] quadratic(int a, int b, int c){
        int delta= (b*b)-(4*a*c);
        
        if(delta==0){
            int x= (-b)/(2*a);
            return new int[]{x};
        }
        
        if(delta<0){
            return new int[]{-1};
        }
        
        int x1=0,x2=0;
        if(delta>0){
            x1= (-b+(int)Math.sqrt(delta))/(2*a);
            x2= (-b-(int)Math.sqrt(delta))/(2*a);
        }
        
        return new int[]{x1,x2};
    }
}