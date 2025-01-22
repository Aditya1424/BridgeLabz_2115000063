import java.util.*;

public class sixth {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num= adi.nextInt();

        if(num> 0) {
           
            System.out.println("Positve");
        } 
		else if(num<0) {
            System.out.println("Negative");
        }
		else{
			System.out.println("Zero");
		}
    }
}
