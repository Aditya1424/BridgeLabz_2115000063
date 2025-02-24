import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Aditya")
class Book {
    public void display() {
        System.out.println("Book class method.");
    }
}
public class RetrieveAnnotations {
    public static void main(String[] args) {
        try {
            Class<Book> bookClass = Book.class;
            if (bookClass.isAnnotationPresent(Author.class)) {
                Author author = bookClass.getAnnotation(Author.class);
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}