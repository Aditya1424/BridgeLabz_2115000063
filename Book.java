
import java.util.*;
public class Book{
    static String libraryName="XYZ";
    String title;
    String author;
    int isbn;
    
    public Book(String title, String author, final int isbn){
        this.title= title;
        this.author=author;
        this.isbn= isbn;
        
    }
    
    public void Display(){
        System.out.println("Library Name: "+libraryName);
        
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Isbn Number: "+isbn);
    }
    
    public static void main(String []args){
        Scanner adi= new Scanner(System.in);
        String title= adi.nextLine();
        String author= adi.nextLine();
        int isbn= adi.nextInt();
        
        Book book= new Book(title,author,isbn);
        if(book instanceof Book){
            book.Display();
        }
        
        
    }
}

