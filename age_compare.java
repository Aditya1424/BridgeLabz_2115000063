import java.util.*;
public class age_compare{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
		
        int ageAmar =adi.nextInt();
        int heightAmar =adi.nextInt();
        int ageAkbar = adi.nextInt();
        int heightAkbar = adi.nextInt();
        int ageAnthony = adi.nextInt();
        int heightAnthony = adi.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        System.out.println("Youngest age: " + youngestAge);
        System.out.println("Tallest height: " + tallestHeight);
    }
}
