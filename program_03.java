import java.util.*;
public class program_03{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String s= adi.next();
        
        if(Pally(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
	}
	
	public static boolean Pally(String s){
	    int i=0;
	    int j=s.length()-1;
	    
	    while(i<j){
	        if(s.charAt(i)!=s.charAt(j)){
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}
}
