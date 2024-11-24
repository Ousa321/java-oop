import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //session01
      /*  System.out.println("------Hello world-----");
        System.out.println("       1.start");
        System.out.println("       2.Clear");
        System.out.println("       3.stop");
        System.out.println("       4.Exit");
        System.out.println("-".repeat(10));
        System.out.println("  ___  _   _ ___  __ _ \n" +
                " / _ \\| | | / __|/ _` |\n" +
                "| (_) | |_| \\__ \\ (_| |\n" +
                " \\___/ \\__,_|___/\\__,_|");
        System.out.print("Print Statement");*/

        //session02
       /* int age = 10;
        System.out.println("this is my age" + age);
        System.out.printf("THIS IS THE AGE: %s", age);

        double av = 11.1;
        float db= 2.3f;
        char a = 'A';
        var data = "String";*/

        /* String name;
        System.out.println("Enter your name: ");
        //use nextline() to print all word.
        name = new Scanner(System.in).nextLine();
        System.out.println("This is your name: " +name);
        */


        // using scanner without getting skipped problem
       /* System.out.print("enter your name");
        String name = new Scanner(System.in).nextLine();
        //if user skip their name
        if(name.isBlank()){
            System.out.println("Enter Your Name!");
        }else{
            System.out.printf(name);
        }

        System.out.println("Your age:");
        int age = new Scanner(System.in).nextInt();

        System.out.println("enter your email: ");
        String email = new Scanner(System.in).nextLine();

        System.out.println("Good atfernoon"+ name);
        System.out.println("this is your age"+ age);
        System.out.println("this is your email"+ email);
*/
        //practice
      /* System.out.println("enter name:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("enter your day:");
        int day = new Scanner(System.in).nextInt();

        System.out.println("enter your birth month:");
        int month = new Scanner(System.in).nextInt();

        System.out.println("enter your birth year:");
        int year = new Scanner(System.in).nextInt();

      //  String year = String.valueOf(Integer.parseInt(new Scanner(System.in).nextLine()));

        System.out.println("Good atfernoon"+ name);
        System.out.println("your born in "+ day);
        System.out.println("your birth month is"+ month);
        System.out.println(" you born in year "+ year);


        System.out.println("=".repeat(5));
        System.out.printf("name: %s, day: %d, Month: %d, year: %d", name, day, month, year);   // this is shortcut print out
            }
        }

       */
        /* homework:
        create a java application in order to allow users to input the product info
        1. inset product code
        2. insert product name
        3.insert product qaulity
        4. insert product price per one
        5. print out all insert oroduct info
         */
        System.out.println("enter code:");
        int code = new Scanner(System.in).nextInt();

        System.out.println("enter Product name:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Insert product qaulity:");
        String qaulity = new Scanner(System.in).nextLine();

        System.out.println("Price per item:");
        int price = new Scanner(System.in).nextInt();

        System.out.println("Product Infomation:");
        String info = new Scanner(System.in).nextLine();
        //  String year = String.valueOf(Integer.parseInt(new Scanner(System.in).nextLine()));

        System.out.println("Your product code" + code);
        System.out.println("your looking for " + name);
        System.out.println("this product qaulity" + qaulity);
        System.out.println("This product cost" + price);
        System.out.println("more infomation about this product" + info);
        System.out.println("=".repeat(5));

        System.out.printf("code: %d,name: %s,qaulity: %s, price: %d, info: %s", code, name, qaulity, price, info);

    }
}

