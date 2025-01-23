import java.util.*;
public class bmi_calc{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        double weight =adi.nextDouble();
        double height =adi.nextDouble();
		height= height/100;

        double bmi=weight/(height*height);
        System.out.printf("Your BMI: %.2f\n", bmi);

        if(bmi<=18.4){
            System.out.println("Underweight");
        }
		else if (bmi>=18.5 && bmi<=24.9) {
            System.out.println("Normal weight");
        }
		else if (bmi>=25.0 && bmi< 39.9) {
            System.out.println("Overweight");
        } 
		else {
            System.out.println("Obese");
        }
    }
}