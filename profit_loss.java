import java.util.*;
public class profit_loss{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double cp= adi.nextDouble();
		double sp= adi.nextDouble();
		
		System.out.println("The Cost Price is INR: "+ cp + " and Selling Price is INR: "+sp);
		
		if((sp-cp)>0){
			double profit= sp-cp;
			double profit_perc = (profit/cp)*100;
			System.out.println("Profit: "+profit+ " and Profit Percentage: "+profit_perc);
		}
		else{
			double loss= cp-sp;
			double loss_perc = (loss/cp)*100;
			System.out.println("Loss: "+loss+ " and Loss Percentage: "+loss_perc);
		}
	}
}
		