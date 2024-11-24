import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
class Product {
    int id;
    String name;
    String category;
    double price;
    List<String> objects;

    // Constructor
    public Product(int id, String name, String category, double price, List<String> objects) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", objects=" + objects +
                '}';
    }
}

public class testing2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to store Product objects
        List<Product> productList = new ArrayList<>();

        // Insert values for a new product
        System.out.println("Insert your product id:");
        int id = scanner.nextInt();

        scanner.nextLine(); // Consume newline
        System.out.println("Product name:");
        String name = scanner.nextLine();
        System.out.println("Category:");
        String category = scanner.nextLine();
        System.out.println("Price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        // Adding a single item to 'objects' list for demonstration
        List<String> objects = new ArrayList<>();
        System.out.println("Enter an object for this product:");
        objects.add(scanner.nextLine());

        // Create Product object and add it to the list
        Product product = new Product(id, name, category, price, objects);
        productList.add(product);

        // Print the list of products
        System.out.println("=".repeat(20));
        System.out.println("Product List:");
        System.out.println("=".repeat(20));
        for (Product p : productList) {
            System.out.println(p);
        }

        scanner.close();
    }
}

 */
