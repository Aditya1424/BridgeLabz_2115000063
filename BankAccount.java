import java.util.*;
public class BankAccount{
	
	static String bankName="ABC Bank";
	static int accountNumber;
	static String accountHolderName;
	static int totalAccount=0;
	public BankAccount(String accountHolderName, final int accountNumber){
		this.accountHolderName= accountHolderName;
		this.accountNumber= accountNumber;
		totalAccount++;
	}
	
	public static int getTotalAccounts(){
		return totalAccount;
	}
	
	public static void display(){
	    System.out.println("Bank Name: "+bankName);
		System.out.println("Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		
	}
	
	
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String accountHolderName= adi.nextLine();
		int accountNumber= adi.nextInt();
		
		BankAccount account= new BankAccount(accountHolderName,accountNumber);
		if(account instanceof BankAccount){
			account.display();
		}
	}
}