import java.util.*;

public class travel{

    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);

        String name = adi.nextLine();
        String fromCity = adi.nextLine();
        String viaCity = adi.nextLine();
        String toCity = adi.nextLine();

        double distanceFromToVia = adi.nextDouble();
        int timeFromToVia = adi.nextInt();
        double distanceViaToFinalCity = adi.nextDouble();
        int timeViaToFinalCity = adi.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");
    }
}
