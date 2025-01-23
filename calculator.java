import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        double num1 =adi.nextDouble();
        double num2 =adi.nextDouble();

        String op =adi.next();
        double result=0;
        
        switch (op){
            case "+":
                result =num1+num2;
                System.out.println("Result: "+result);
                break;
            case "-":
                result =num1-num2;
                System.out.println("Result: "+result);
                break;
            case "*":
                result =num1*num2;
                System.out.println("Result: "+result);
                break;
            case "/":
                if (num2!= 0) {
                    result =num1/num2;
                    System.out.println("Result: "+result);
                } 
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
