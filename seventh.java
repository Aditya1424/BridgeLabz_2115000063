import java.util.*;
public class seventh {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int month = adi.nextInt();
        int day = adi.nextInt();

        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } 
		else {
            System.out.println("Not a Spring Season.");
        }
    }
}
