import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;


public class week4day1 {
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //using
        HashMap<Integer, String> username = new HashMap<>();
        username.put(1, "ousa");
        username.put(2, "bad luck");
        System.out.println("All Element in HashMap:");
        for(Map.Entry<Integer, String> map: username.entrySet()) {
            System.out.println(map);
        }
       /* //to delete
        username.remove(2);
        System.out.println("all element after deleted in Hashmap:");
        System.out.println(username);


        System.out.print("Enter a key to delete: ");
        int keyToDelete = scanner.nextInt();
        if (username.containsKey(keyToDelete)) {
            username.remove(keyToDelete);
            System.out.println("HashMap after deletion:");
            for (Map.Entry<Integer, String> map : username.entrySet()) {
                System.out.println(map);
            }
        } else {
            System.out.println("Key not found in HashMap.");
        }

        scanner.close();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //using
        HashMap<Integer, String> username = new HashMap<>();
        username.put(1, "ousa");
        username.put(2, "bad luck");
        System.out.println("All Element in HashMap:");
        for (Map.Entry<Integer, String> map : username.entrySet()) {
            System.out.println(map.getKey()+"."+map.getValue());
        }
        System.out.println("Insert key to delete:");
        int key = new Scanner(System.in).nextInt();
        System.out.println("all elements after deleted in HaspMap:");
        username.remove(username);
        }

    //to input user and order ID
    public static void main(String[] args) {
        HashMap<Integer, String > username = new HashMap<>();
        System.out.println("insert number of name:");
        int n = new Scanner(System.in).nextInt();
        for(int i=0; i<n; i++){
            System.out.println("insert key for username:");
            int key = new Scanner(System.in).nextInt();
            System.out.println("insert username:");
            String name = new Scanner(System.in).nextLine();
            username.put(key, name);
        }
        System.out.println(username);






    //Creating unique session IDs in web applications
    public static void main(String[] args) {
        HashMap<UUID, String> username = new HashMap<>();
        username.put(UUID.randomUUID(), "ousa");
        username.put(UUID.randomUUID(), "sa");
        System.out.println(username);



     */
    /*
    //HashMap//
   //create, update, search, delete, exit username by using HashMap
        public static HashMap<Integer, String> usernames = new HashMap<>();
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("\n1. Create Username");
                System.out.println("2. Update Username");
                System.out.println("3. Search Username");
                System.out.println("4. Delete Username");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Clear the newline
            //this is the important part (if choice == 5...)
                // after that just using private static void "....."
                     // print out message
                    // using int or string depend on the message letter or number
                    //
                if (choice == 5) {
                    System.out.println("Exiting...");
                    break;
                }

                switch (choice) {
                    case 1: createUsername(); break;
                    case 2: updateUsername(); break;
                    case 3: searchUsername(); break;
                    case 4: deleteUsername(); break;
                    default: System.out.println("Invalid option. Please try again.");
                }
            }
        }

        private static void createUsername() {
            //System.out.print("Enter new username: ");
            //String username = scanner.nextLine();
            System.out.print("[+] inert ID username: ");
            int key = new Scanner(System.in).nextInt();
           System.out.print("[+] Insert username: ");
            String name = new Scanner(System.in).nextLine();
            usernames.put(key, name);

        }

        private static void updateUsername() {
            System.out.print("[+] Insert ID for username: ");
            int key = new Scanner(System.in).nextInt();// using int cuz input key number
            if (usernames.containsKey(key)) { //update when the key number is contained
                System.out.print("[+] Insert username: "); //then updating
                String name = new Scanner(System.in).nextLine(); // use to record new update
                usernames.put(key, name);
            }
        }

        private static void searchUsername() {
            System.out.print("[+] insert ID: ");
            int key = new Scanner(System.in).nextInt();
            usernames.get(key);

            String username = usernames.get(key); //search
            System.out.println("enter username to search:"+username);

        }

        private static void deleteUsername() {
            System.out.print("[+] Enter username to delete: ");
            int key = new Scanner(System.in).nextInt();
            if (usernames.containsKey(key)) {
                System.out.print("[+] search username: ");
                String name = new Scanner(System.in).nextLine();
                usernames.put(key, name);
            }
        }


     */
     //TreeMap (cannot have null)
    

    }















