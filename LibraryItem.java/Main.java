import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store LibraryItem objects
        ArrayList<LibraryItem> library = new ArrayList<>();
        Reader reader = new Reader("Blair");

        // Add sample items to the library
        library.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction"));
        library.add(new Book("1984", "George Orwell", "Dystopian"));
        library.add(new Magazine("National Geographic", "NatGeo", "March 2023"));
        library.add(new DVD("Inception", "Christopher Nolan", 148));
        library.add(new Newspaper("The Times", "Times Group", "March 20, 2023"));

        // Menu-driven program for user interaction
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. View All Library Items");
            System.out.println("2. Borrow an Item");
            System.out.println("3. Return an Item");
            System.out.println("4. View Borrowed Items");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1: // View all library items
                    System.out.println("\nLibrary Items:");
                    for (LibraryItem item : library) {
                        System.out.println(item);
                    }
                    break;

                case 2: // Borrow an item
                    System.out.print("\nEnter the title of the item to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    boolean itemFound = false;

                    for (LibraryItem item : library) {
                        if (item.getTitle().equalsIgnoreCase(borrowTitle) && item.isAvailable()) {
                            reader.borrowedItems(item);
                            itemFound = true;
                            break;
                        }
                    }

                    if (!itemFound) {
                        System.out.println("Item not found or already borrowed.");
                    }
                    break;

                case 3: // Return an item
                    System.out.print("\nEnter the title of the item to return: ");
                    String returnTitle = scanner.nextLine();
                    boolean returned = false;

                    for (LibraryItem item : reader.getBorrowedItems()) {
                        if (item.getTitle().equalsIgnoreCase(returnTitle)) {
                            reader.getBorrowedItems().remove(item);
                            item.borrowItem(); // Reset to available
                            System.out.println(reader.getName() + " returned " + item.getTitle());
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Item not found in your borrowed list.");
                    }
                    break;

                case 4: // View borrowed items
                    System.out.println("\n" + reader.getName() + "'s Borrowed Items:");
                    if (reader.getBorrowedItems().isEmpty()) {
                        System.out.println("No items borrowed.");
                    } else {
                        for (LibraryItem item : reader.getBorrowedItems()) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 5: // Exit
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
