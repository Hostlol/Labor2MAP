import java.util.List;

public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        book.setBookId(this.bookRepository.bookIdCounter);
        this.bookRepository.books.add(book);
        this.bookRepository.bookIdCounter++;
    }

    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}