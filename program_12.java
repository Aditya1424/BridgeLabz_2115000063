import java.util.*;

public class program_12{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double angle= adi.nextDouble();
		double radians= (angle*3.14)/180;
		
		double[] res = calculate(radians);
		
		System.out.println(res[0]);
		System.out.println(res[1]);
		System.out.println(res[2]);
		
	}
	
	public static double[] calculate(double radians){
        
        double sine= Math.sin(radians);
        double cosine= Math.cos(radians);
        double tangent= Math.tan(radians);
        
        return new double[]{sine,cosine,tangent};
        
	}
}

