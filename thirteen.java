import java.util.*;
public class thirteen{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n =adi.nextInt();

        if (n>0){
            int sum = 0;
			for(int i=1;i<=n;i++){
				sum+=i;
			}
            int formula = (n*(n + 1))/2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formula);
        }
    }
}
