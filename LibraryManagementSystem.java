import java.util.*;
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}


interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}


class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public boolean reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book reserved successfully.");
            return true;
        }
        System.out.println("Book is already reserved.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public boolean reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved successfully.");
            return true;
        }
        System.out.println("DVD is already reserved.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Magazine("M001", "National Geographic", "Various"));
        items.add(new DVD("D001", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem();
            }
        }
    }
}
