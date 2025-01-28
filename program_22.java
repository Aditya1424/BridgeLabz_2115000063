import java.util.*;
public class program_22{
     public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        double x1= adi.nextDouble();
        double y1 =adi.nextDouble();
        double x2 =adi.nextDouble();
        double y2 =adi.nextDouble();
        double x3= adi.nextDouble();
        double y3= adi.nextDouble();

        boolean isCollinearUsingSlope = checkCollinearityUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearUsingArea = checkCollinearityUsingArea(x1, y1, x2, y2, x3, y3);

        if (isCollinearUsingSlope && isCollinearUsingArea) {
            System.out.println("The points are collinear.");
        } 
        else {
            System.out.println("The points are not collinear.");
        }
    }
    
    public static boolean checkCollinearityUsingSlope(double x1, double y1, double x2, double y2, double x3,
            double y3){
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    public static boolean checkCollinearityUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        return area ==0;
    }
}