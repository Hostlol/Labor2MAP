import java.util.Scanner;
public class PersistentConsoleUI {
    public static void startConsole(){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        // Display a welcome message
        System.out.println("Welcome to the Library");

        while (isRunning) {
            // Display menu options
            System.out.println("Select an option:");
            System.out.println("1. Start the program");
            System.out.println("2. About");
            System.out.println("3. Quit");

            // Prompt the user to select an option
            System.out.print("Enter the option number: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.println("Program Started!");
                    // Add your program logic for option 1 here
                    break;
                case 2:
                    System.out.println("This program is a simple Java application.");
                    // Add information about the program for option 2
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    isRunning = false; // Exit the loop
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}