import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class program_13{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        System.out.println("Current time in GMT: " + ZonedDateTime.now(ZoneId.of("GMT")));
        System.out.println("Current time in IST: " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("Current time in PST: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }
}
