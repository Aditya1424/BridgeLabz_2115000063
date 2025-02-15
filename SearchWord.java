import java.util.*;
public class SearchWord{
    public static String findSentenceWithWord(String[] sentences, String word) {
        for(String sentence: sentences){
            if(sentence.contains(word)){
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n = Integer.parseInt(adi.nextLine());
        String[] sentences= new String[n];
        
        for (int i = 0; i < n; i++) {
            sentences[i] = adi.nextLine();
        }
        String word = adi.nextLine();
        
        String result = findSentenceWithWord(sentences,word);
        System.out.println(result);
    }
}
