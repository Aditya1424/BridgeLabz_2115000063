class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookInfo() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSizeMB + "MB");
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("123-4567890123", "Java Programming", "John Doe");
        book.displayBookInfo();
        
        System.out.println();
        
        EBook ebook = new EBook("987-6543210987", "Advanced Java", "Jane Doe", 5.5);
        ebook.displayEBookInfo();
        
        System.out.println("\nChanging author name...");
        book.setAuthor("Michael Smith");
        System.out.println("Updated Author: " + book.getAuthor());
    }
}
