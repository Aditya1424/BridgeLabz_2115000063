import java.util.*;
public class program_21{
    public static void main(String []args){
        Scanner adi= new Scanner(System.in);
        double x1=adi.nextDouble();
        double x2=adi.nextDouble();
        double y1=adi.nextDouble();
        double y2=adi.nextDouble();
        
        double distance =Euclidean(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        double[] equation =findLineEquation(x1, y1, x2, y2);
        displayLineEquation(equation);
        
    }
    
    public static double Euclidean(double x1,double x2,double y1, double y2){
        double res= Math.sqrt(Math.pow(x2-x1,2))+Math.sqrt(Math.pow(y2-y1,2));
        return res;
    }
    
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 -(m * x1);
        
        equation[0] = m;
        equation[1] = b;

        return equation;
    }
    public static void displayLineEquation(double[] equation) {
        double m = equation[0];
        double b = equation[1];
        System.out.println("The equation of the line is: y = " + m + "x + " + b);
    }
}