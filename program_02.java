import java.util.*;
public class program_02{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		int a[]= new int[5];
		for(int i=0;i<5;i++){
			a[i]= adi.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				if(a[i]%2==0){
				    System.out.println(a[i]+" is positive and even");
				}
				else{
				    System.out.println(a[i]+" is positive and odd");
				}
			}
			
			else if (a[i]<0) {
                System.out.println(a[i]+" is negative");
			}
			else{
				System.out.println(a[i]+" is zero");
			}
		}
		
		if(a[0]==a[a.length-1]){
		    System.out.println("The first and last elements are equal");
		}
		 else if (a[0] >a[a.length-1]) {
            System.out.println("The first element is greater than the last element");
        }
        else{
            System.out.println("The first element is less than the last element");
        }
	}
}