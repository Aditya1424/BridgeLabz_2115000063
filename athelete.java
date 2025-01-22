import java.util.*;

public class athelete {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
		
        double s1 = adi.nextDouble();
        double s2 =adi.nextDouble();
        double s3 =adi.nextDouble();

        double perimeter =s1+s2+s3;
        double totalDistance = 5000;
        double rounds = totalDistance/perimeter;

        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");
    }
}
