import java.util.*;
public class program_07{
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        int num= adi.nextInt();
        if(num<=0){
            System.out.println("Not a natural number");
            return;
        }
        int size= (num/2)+1;        
        int even[]= new int[size];
        int odd[]= new int[size];
        int ei=0;
        int oi=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even[ei]= i;
                ei++;
            }
            else{
                odd[oi]=i;
                oi++;
            }
        }
        
        for(int i=0;i<even.length;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        for(int i=0;i<odd.length;i++){
            System.out.print(odd[i]+" ");
        }
        
    }
}
