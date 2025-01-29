import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class program_15{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Formatted Date (dd/MM/yyyy): " + LocalDate.now().format(format1));
        System.out.println("Formatted Date (yyyy-MM-dd): " + LocalDate.now().format(format2));
        System.out.println("Formatted Date (EEE, MMM dd, yyyy): " + LocalDate.now().format(format3)); 
    }
}
