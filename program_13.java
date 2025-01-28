import java.util.*;
public class program_13{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		int n=11;
	    double a[]= new double[n];
	    for(int i=0;i<11;i++){
	        a[i]= adi.nextDouble();
	    }
	    
	    
	    System.out.println(add(a));
	    System.out.println(Mean(a,n));
	    System.out.println(shortest(a));
	    System.out.println(tallest(a));
	}
	    
	    
	
	public static double add(double a[]){
        double sum=0.0;
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
        
	}
	
	public static double Mean(double a[],int n ){
	    
	    double mean= add(a)/n;
	    return mean;
	}
	
	public static double shortest(double a[]){
	    
	    double res=a[0];
	    for(int i=1;i<a.length;i++){
	        if(a[i]<res){
	            res= a[i];
	        }
	    }
	    return res;
	}
	
	public static double tallest(double a[]){
	    
	    double res=0;
	    for(int i=0;i<a.length;i++){
	        if(a[i]>res){
	            res= a[i];
	        }
	    }
	    return res;
	}
	    
}

