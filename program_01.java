import java.util.*;
public class program_01{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		int a[]= new int[10];
		for(int i=0;i<10;i++){
			a[i]= adi.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				System.out.println("Invalid age");
			}
			else if (a[i] >= 18) {
                System.out.println("The student with the age " + a[i] + " can vote");
			}
			else{
				System.out.println("The student with the age " + a[i] + " cannot vote");
			}
		}		
	}
}