import java.util.Scanner;
public class PersistentConsoleUI {
    public static void startConsole(){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        BookRepository bookRepo = new BookRepository();
        BookController bookController = new BookController(bookRepo);
        AuthorRepository authorRepo = new AuthorRepository();
        AuthorController authorController = new AuthorController(authorRepo);
        // Create authors
        Author author1 = new Author("John Smith");
        Author author2 = new Author("Alice Johnson");
        Author author3 = new Author("Michael Brown");

        Book book1 = new Book();
        book1.setTitle("The Adventure Begins");
        book1.addAuthor(author1);
        book1.addAuthor(author2);

        Book book2 = new Book();
        book2.setTitle("Mystery in the Woods");
        book2.addAuthor(author1);

        Book book3 = new Book();
        book3.setTitle("Coding 101");
        book3.addAuthor(author2);
        book3.addAuthor(author3);

        authorController.addAuthor(author1);
        authorController.addAuthor(author2);
        authorController.addAuthor(author3);

        bookController.addBook(book1);
        bookController.addBook(book2);
        bookController.addBook(book3);
        // Display a welcome message
        System.out.println("Welcome to the Library");

        while (isRunning) {
            // Display menu options
            System.out.println("Select an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Show Books");
            System.out.println("4. Add Author");
            System.out.println("5. Remove Author");
            System.out.println("6. Show Authors");
            System.out.println("7. Tests");
            System.out.println("8. Quit");

            // Prompt the user to select an option
            System.out.print("Enter the option number: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("What is the name of the book?");
                    String book_name = scanner.nextLine();
                    Book temp_book = new Book();
                    temp_book.setTitle(book_name);
                    System.out.println("Who is the Author?");
                    String temp_name2 = scanner.nextLine();
                    Author temp_author =new Author(temp_name2);
                    authorRepo.addAuthor(temp_author);
                    temp_book.addAuthor(temp_author);
                    bookController.addBook(temp_book);

                    break;
                case 2:
                    System.out.println("Which Book-id to remove?");
                    bookController.printAllBooks();
                    int bookToRemove = scanner.nextInt();
                    bookController.removeBook(bookToRemove);
                    System.out.println("Book removed");
                    break;
                case 3:
                    System.out.println("The books are:");
                    bookController.printAllBooks();
                    break;
                case 4:
                    System.out.println("What is the name of the Author?");
                    // Add your program logic for option 1 here
                    String temp_name = scanner.nextLine();
                    authorRepo.addAuthor(new Author(temp_name));
                    System.out.println("Author added");
                    break;
                case 5:
                    System.out.println("Which Author-id to remove?");
                    authorController.printAllAuthors();
                    int authorToRemove = scanner.nextInt();
                    authorController.removeAuthor(authorToRemove);
                    System.out.println("Author Removed");
                    break;
                case 6:
                    System.out.println("The Authors are:");
                    authorController.printAllAuthors();
                    break;
                case 7:
                    TestBookAuthor.test_books();
                    TestBookAuthor.test_authors();
                    System.out.println("All Tests Completed");
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    isRunning = false; // Exit the loop
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
        scanner.close();
    }
}
