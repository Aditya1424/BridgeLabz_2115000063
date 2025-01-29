import java.util.*;
public class program_11{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        String str1= adi.nextLine();
        String str2= adi.nextLine();
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams");
        } 
        else {
            System.out.println("The strings are not anagrams");
        }
        
    }
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    
}
