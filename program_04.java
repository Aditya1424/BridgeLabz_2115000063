import java.util.*;
public class program_04{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        double a[]= new double[10];
        double sum=0.0;
        int i=0;
        
        while(true){
            double num= adi.nextDouble();
            if(num<=0 || i==10){
                break;
            }
            a[i]= num;
            i++;
        }
        for(int x=0;x<a.length;x++) {
            sum+=a[x];
            }
        System.out.println(sum);
    }
}