import java.util.*;

public class program_08{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		int n1= adi.nextInt();
		int n2= adi.nextInt();
		int n3= adi.nextInt();
		
	    int[] res = check(n1,n2,n3);
        System.out.println("Smallest: " +res[0]);
        System.out.println("Largest: " + res[1]);
	}
	
	public static int[] check(int n1, int n2,int n3){
	   int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
	}
}

