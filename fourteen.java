import java.util.*;
public class fourteen{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n =adi.nextInt();
		
		if(n>0){
			int i=1;
			int fac=1;
			while(i<=n){
				fac= fac*i;
				i++;
			}
			System.out.println(fac);
		}

       
    }
}