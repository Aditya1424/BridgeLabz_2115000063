import java.util.*;
public class program_02{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String s= adi.next();
        
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        System.out.println(res);
        
	}
}
