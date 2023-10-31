import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<Book> books = new ArrayList<>();
    int bookIdCounter = 1;

    public void addBook(Book book) {
        book.setBookId(bookIdCounter);
        books.add(book);
        bookIdCounter++;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
