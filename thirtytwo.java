import java.util.*;

public class thirtytwo{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num =adi.nextInt();

        int c=0;
		
		while(num!=0){
			int temp= num%10;
			c++;
			num/=10;
		}
		
		System.out.println(c);

    }
}
