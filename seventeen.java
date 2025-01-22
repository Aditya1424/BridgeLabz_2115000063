import java.util.*;

public class seventeen{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
		double sal= adi.nextDouble();
		int yrs= adi.nextInt();
		
		if(yrs>5){
			double bonus= sal*0.05;
			System.out.println(bonus);
		}
		else{
			System.out.println("Year of service is less than 5 years");
		}
	}
}