public class Author implements Person {
    private String name;
    private int AuthorId;

    public Author(String name){
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    public void writeBook(Book book){
        book.addAuthor(this);
    }

    public void setAuthorId(int authorIdCounter) {
        this.AuthorId = authorIdCounter;
    }
}