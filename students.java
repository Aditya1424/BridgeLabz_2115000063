import java.util.*;

public class students {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		int numberOfStudents = adi.nextInt();
        int handshakes = (numberOfStudents*(numberOfStudents - 1))/ 2;
        System.out.println("The maximum number of handshakes: " + numberOfStudents + " students is " + handshakes);
	}
}