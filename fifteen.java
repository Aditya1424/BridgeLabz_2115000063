import java.util.*;
public class fifteen{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n =adi.nextInt();
		
		if(n>0){
			int fac=1;
			for(int i=1;i<=n;i++){
				fac= fac*i;
			}
			System.out.println(fac);
		}   
    }
}