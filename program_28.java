import java.util.*;

public class program_28{
    public static void main(String[] args){
        Scanner adi =new Scanner(System.in);
        int year= adi.nextInt();

        if(year>= 1582 && isLeapYear(year)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year%4==0 && year%100 !=0) || (year%400== 0);
    }
}