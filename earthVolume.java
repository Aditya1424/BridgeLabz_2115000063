import java.util.*;
public class earthVolume {
    public static void main(String[] args) {
       
        double radiusKm = 6378;
        double kmToMiles = 0.621371;

       
        double volume_Km = (4/3) *Math.PI*Math.pow(radiusKm, 3);


        double radiusMiles = radiusKm * kmToMiles;
        double volume_Miles = (4/3) *Math.PI*Math.pow(radiusMiles, 3);

        
        System.out.println("The volume of Earth in cubic kilometers is " + volume_Km);
        System.out.println("The volume of Earth in cubic miles is " + volume_Miles);
    }
}
