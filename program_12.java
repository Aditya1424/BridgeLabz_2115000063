import java.util.*;
public class program_12{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        String sentence= adi.nextLine();
        String oldWord=adi.next();
        String newWord =adi.next();
        System.out.println("Updated Sentence: " + replaceWord(sentence, oldWord, newWord));
    }
    
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
