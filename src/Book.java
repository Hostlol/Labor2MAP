import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();

    private int BookId;

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int BookId){
        this.BookId = BookId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void addAuthor(Author author)
    {
        authors.add(author);
    }

    public List<Author> getAuthors() {
            return authors;
    }
    public void printAuthors(){
        for (Author author : authors){
            System.out.println(author.getName());
        }
    }
    public void removeAuthor(Author author) {
        authors.remove(author);
    }


//    public void addGenre(Genre genre){
//        GenreBelonging genreBelonging = new GenreBelonging(this, genre);
//
//    }
//    public void addEvents(Events event){
//        BookEvent bookEvent = new BookEvent(this, event);

//    }
}
