import java.util.List;

public class AuthorController {
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addAuthor(Author author) {
        authorRepository.addAuthor(author);
    }

    public Author findAuthorByName(String authorName) {
        return authorRepository.findAuthorByName(authorName);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.getAllAuthors();
    }

}
