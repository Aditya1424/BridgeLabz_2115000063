import java.util.*;
public class sixteen{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n =adi.nextInt();
		
		if(n>0){
			
			for(int i=1;i<=n;i++){
				if(i%2==0){
					System.out.println(i+" is even");
				}
				else{
					System.out.println(i+" is odd");
				}
			}
		}   
    }
}