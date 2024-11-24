package exceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
class Teacher{
    int id;
    String name;
    String gender;
    List<String> subject;
    List<Student> students = new ArrayList<>();

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", subject=" + subject +
                ", students=" + students +
                '}';
    }
}
class Student {
    int id;
    String name;
    String gender;
    List<String> phoneNumbers;

    @Override
    public String toString() {
        return "Student{" +
                "id =" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
public class week4day2 {
    /*
    public static void main(String[] args) {
        try {
            System.out.print("[+] Insert name: ");
            String name = new Scanner(System.in).nextLine();
            String [] numbers = {"0","1","2","3","4","5","6","7","8","9"};
            for(String n: numbers){
                if(name.contains(n)){
                    throw new Exception("[!] Name must be no number.");
                }
            }
            System.out.println(name);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

     */
/*
    public static void main(String[] args) {



        Student student1 = new Student();
        student1.id = 1;
        System.out.println("insert your student name:");
        student1.name = new Scanner(System.in).nextLine();
        System.out.println("gender:");
        student1.gender = new Scanner(System.in).nextLine();
        System.out.println("phone number:");
        student1.phoneNumbers = new ArrayList<>(
                List.of( new Scanner(System.in).nextLine())
        );

        Teacher teacher1 = new Teacher();
        teacher1.id = 1;
        System.out.println("Teacher name:");
        teacher1.name = new Scanner(System.in).nextLine();
        System.out.println("gender:");
        teacher1.gender = new Scanner(System.in).nextLine();
        System.out.println("Subject:");
        teacher1.subject = new ArrayList<>(
                List.of(new Scanner(System.in).nextLine())

        );
        teacher1.students.add(student1); //in this case we can know who the teacher teach

        System.out.println("=".repeat(20));
        System.out.println("Teacher info");
        System.out.println(teacher1);


        System.out.println("=".repeat(20));
        System.out.println("ousa info");
        System.out.println(student1);//before use this: right click + generate...+ toString+ [OK]

 */
/*
        Student student2 = new Student();
        student2.id = 2;
        student2.name = "sasa";
        student2.gender ="female";
        student2.phoneNumbers= new ArrayList<>(
                List.of("095953167","083848334")
        );


        System.out.println("=".repeat(20));
        System.out.println("sasa info");
        System.out.println(student2);
 */
class Product{
    int id;
    String name;
    String category;
    double price;
    List<String>objects;

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
public class week4day2 {
    public static void main(String[] args) {
        Product product1;
        product1 = new Product();

        System.out.println("insert your product id:");
        product1.id = new Scanner(System.in).nextInt();
        System.out.println("product name:");
        product1.name = new Scanner(System.in).nextLine();
        System.out.println("category:");
        product1.category = new Scanner(System.in).nextLine();
        System.out.print("Price:");
        product1.price = new Scanner(System.in).nextInt();
        System.out.println("Enter an object for this product:");
        product1.objects = new ArrayList<>(
                List.of(new Scanner(System.in).nextLine())
        );
        System.out.println("=".repeat(20));
        System.out.println("product info");
        System.out.println("=".repeat(20));
        System.out.println(product1);
    }
}




/* homework:
change from teacher to product : product name, price , category, ... 
 */
