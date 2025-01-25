import java.util.*;

public class program_06{
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        
        double a[]= new double[11];
        for(int i=0;i<11;i++){
            a[i]= adi.nextDouble();
        }
        double sum=0.0;
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Mean height: "+(sum/11));
        
    }
}
