import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestBookAuthor {
    static void test_books(){
        BookRepository bookRepo = new BookRepository();
        BookController bookController = new BookController(bookRepo);
        Book book = new Book();
        book.setTitle("Sample Book");
        bookController.addBook(book);
        assertNotNull(book.getBookId());
        System.out.println("Add Book Test Completed");

        Book book2 = new Book();
        book2.setTitle("Sample Book1");
        bookController.addBook(book2);
        Book foundBook = bookController.findBookByTitle("Sample Book1");
        assertNotNull(foundBook);
        assertEquals("Sample Book1", foundBook.getTitle());
        System.out.println("Find Book By Title Test Completed");

        Book book3 = new Book();
        book3.setTitle("Sample Book2");
        bookController.addBook(book3);
        int bookId = book3.getBookId();
        bookController.removeBook(bookId);
        assertNull(bookController.findBookByTitle("Sample Book2"));
        System.out.println("Remove Book Test Completed");

        Author author = new Author("sample author");
        author.setName("Author Name");
        Book book4 = new Book();
        book4.addAuthor(author);
        assertEquals(1, book4.getAuthors().size());
        book4.removeAuthor(author);
        assertEquals(0, book4.getAuthors().size());
        System.out.println("Add New Author To Book Test Completed");
    }
    static void test_authors(){

    }
}
