import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();

    public Book(String title){
        this.title = title;
    }

    public void addAuthor(Author author)
    {
        authors.add(author);
    }

    public void addGenre(Genre genre){
        GenreBelonging genreBelonging = new GenreBelonging(this, genre);

    }
    public void addEvents(Events event){
        BookEvent bookEvent = new BookEvent(this, event);

    }
}
