import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class program_16{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);

        LocalDate firstDate = LocalDate.parse(adi.next());
 
        LocalDate secondDate = LocalDate.parse(adi.next());
        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is before second date.");
        } 
        else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is after second date.");
        } 
        else {
            System.out.println("Both dates are the same.");
        }
    }
}
