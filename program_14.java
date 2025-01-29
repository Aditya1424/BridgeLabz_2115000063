import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class program_14{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        
        System.out.println("Enter a date (yyyy-MM-dd):");
        LocalDate date = LocalDate.parse(adi.next());
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Modified Date: " + modifiedDate);   
    }
}
