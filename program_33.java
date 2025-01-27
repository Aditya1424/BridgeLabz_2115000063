import java.util.*;

public class program_33{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        
        int age[]= new int[3];
        double height[]= new double[3];
        
        for(int i=0;i<3;i++){
            age[i]= adi.nextInt();
        }
        for(int i=0;i<3;i++){
            height[i]= adi.nextDouble();
        }
        
        System.out.println(youngest(age));
        System.out.println(tallest(height));
    }
    
    public static int youngest(int age[]){
        int min=age[0];
        for(int i=1;i<age.length;i++){
            if(age[i]<=min){
                min= age[i];
            }
        }
        
        return min;
    }
    
    public static double tallest(double height[]){
        double max=height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>max){
                max= height[i];
            }
        }
        return max;
    }
}
