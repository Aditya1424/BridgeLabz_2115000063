import java.util.*;
public class twelveth{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n =adi.nextInt();

        if (n>0){
            int sum = 0;
			int i = 1;
            while (i<= n) {
                sum+= i;
                i++;
            }
            int formula = (n*(n + 1))/2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formula);
        }
    }
}
