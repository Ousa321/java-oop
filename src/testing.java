import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


    /*
    private static HashMap<String, String> usernames = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Create Username");
            System.out.println("2. Update Username");
            System.out.println("3. Search Username");
            System.out.println("4. Delete Username");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createUsername();
                    break;
                case 2:
                    updateUsername();
                    break;
                case 3:
                    searchUsername();
                    break;
                case 4:
                    deleteUsername();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to create a new username
    private static void createUsername() {
        System.out.print("Enter a new username: ");
        String username = scanner.nextLine();

        if (usernames.containsKey(username)) {
            System.out.println("Username already exists.");
        } else {
            System.out.print("Enter user ID for this username: ");
            String userId = scanner.nextLine();
            usernames.put(username, userId);
            System.out.println("Username created successfully.");
        }
    }

    // Method to update an existing username
    private static void updateUsername() {
        System.out.print("Enter the username to update: ");
        String username = scanner.nextLine();

        if (usernames.containsKey(username)) {
            System.out.print("Enter new user ID for this username: ");
            String newUserId = scanner.nextLine();
            usernames.put(username, newUserId);
            System.out.println("Username updated successfully.");
        } else {
            System.out.println("Username not found.");
        }
    }

    // Method to search for a username
    private static void searchUsername() {
        System.out.print("Enter the username to search: ");
        String username = scanner.nextLine();

        if (usernames.containsKey(username)) {
            System.out.println("Username found. User ID: " + usernames.get(username));
        } else {
            System.out.println("Username not found.");
        }
    }

    // Method to delete a username
    private static void deleteUsername() {
        System.out.print("Enter the username to delete: ");
        String username = scanner.nextLine();

        if (usernames.containsKey(username)) {
            usernames.remove(username);
            System.out.println("Username deleted successfully.");
        } else {
            System.out.println("Username not found.");
        }
    }

     */
    /*
    Homework:
            1. Create class Product (id, name, category, price)
2. Create object of Product (Insert value and print it)
3. Create a list of product objects
4. Print the list of above product objects

     */





