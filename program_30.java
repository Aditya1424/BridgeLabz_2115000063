
import java.util.*;

public class program_30{
    public static void main(String[] args){
        Scanner adi =new Scanner(System.in);
        int op= adi.nextInt();
        switch(op){
            case 1:
                double yards =adi.nextDouble();
                System.out.println("Feets: "+yardsToFeets(yards));
                break;
            
            case 2:
                double feets =adi.nextDouble();
                System.out.println("Yards: " +feetsToYards(feets));
                break;
                
            case 3:
                double meters =adi.nextDouble();
                System.out.println("Inches: " +metersToInches(meters));
                break;
                
            case 4:
                double inches =adi.nextDouble();
                System.out.println("Meters: " +inchesToMeters(inches));
                break;
                
            case 5:
                inches =adi.nextDouble();
                System.out.println("Centimeters: " +inchesToCm(inches));
                break;
        }
    }

    public static double yardsToFeets(double yards){
       return yards*3;
    }
    
    public static double feetsToYards(double feets){
       return feets*0.333333;
    }
    
     public static double metersToInches(double meters){
        return meters*39.3701;
    }

    public static double inchesToMeters(double inches){
        return inches* 0.0254;
    }
    
    public static double inchesToCm(double inches){
        return inches* 2.54;
    }
}

