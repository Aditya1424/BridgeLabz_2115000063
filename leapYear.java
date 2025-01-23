import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
       
        int year = adi.nextInt();

        if (year <1582) {
            System.out.println("The year is not in the Gregorian calendar.");
        } else if (year % 4 == 0) {
            if (year % 100!= 0 || year%400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}