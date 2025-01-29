import java.util.*;
public class program_09{
    public static void main(String []args){
        Scanner adi= new Scanner(System.in);
        
        String s= adi.nextLine();
        int freq[]= new int[256];
        
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        
        int maxFreq=0;
        char maxChar=s.charAt(0);
        for (char c: s.toCharArray()) {
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                maxChar = c;
            }
        }
        System.out.println("Most Frequent Character: "+ maxChar);
        
    }
}