import java.util.Scanner;

public class week1day2 {
    public static void main(String[] args) {
            /* (1)
            System.out.println("========New system========");
            System.out.println("Ïnsert your age:");
            int age = new Scanner(System.in).nextInt();
            System.out.print("insert your gender:");
            Character gender = new Scanner(System.in).nextLine().charAt(0);

            if((age>18 || gender.toString().equalsIgnoreCase("m"))
                || gender.toString().equalsIgnoreCase("f")){
                System.out.println("you are right");
            }else {
                System.out.println("You're wrong");
            }


             */

          /* (2) //put the right ID
            System.out.println("=".repeat(10)+ "New system"+"=".repeat(10));
            System.out.println("insert your gender:");
            Character gender = new Scanner(System.in).nextLine().charAt(0);
            if(gender.toString().equalsIgnoreCase("m")){
                System.out.println("u are male");
                System.out.println("insert your male ID card:");
                String idCard = new Scanner(System.in).nextLine();
                if(idCard.startsWith("001")) {
                    System.out.println("succeed login");
                }

                }else if (gender.toString().equalsIgnoreCase("f")){
                    System.out.println("u are female");
                    System.out.println("insertt your male ID card:");
                    String idCard = new Scanner(System.in).nextLine();
                    if(idCard.startsWith("002")) {
                        System.out.println("succeed login!");

                    }else {
                        System.out.println("u are not human");
                    }
                }
            }

           */





          // (3) // promotion
           /* System.out.println("Promotion");
            int year = 2024;
            System.out.println(year);
            double avg = year;
            System.out.println(avg);
            // casting
            System.out.println("Casting");
            float price = 2.5f;
            System.out.println(price);
            int priceInInteger =(int) price;
            System.out.println(priceInInteger);

           */
//(4)
        /*
                    int i = 2024;
                    double d = i;

                    Integer dataInInt = 12;
                    Double dataInDouble = dataInInt.doubleValue();
                    System.out.println(dataInInt);
                    System.out.println(dataInDouble);
                    //
                    Float f = 1.2f;
                    System.out.println(f);
                    Integer ii = f.intValue();
                    System.out.println(ii);


         */

//(5)
       //input email with @gmail.com
        /*
        System.out.println("==========Email Validation==========");
        System.out.println("insert your email:");
        String email = new Scanner(System.in).nextLine();
        if(email.contains("@gmail.com")){
            System.out.println("valid email");
        }else {
            System.out.println("invalid email");
        }

       */


     //  (5) //find if it was even or odd number
/*
        System.out.println("=".repeat(10)+"News system"+"=".repeat(10));
        System.out.println("enter your number");
        int number = new Scanner(System.in).nextInt();
        if(number%2==0){ //if it devide 2 it is even num
            System.out.println("Even Number");
        }else {
            System.out.println("odd number");

        }

         */

//(6) switch vs if
        /* int a = 1;
    switch (a){
        case 1:{ //can't be number if it string
            System.out.println("thi is one");
            break;
            //break avoiding unnesscessary iteration
        }
        case 2:{
            System.out.println("this is two");
            break;
        }
        default:{
            System.out.println("this default statement");
        }
    }*/

        /***
         * <p>Hello</p>
         * <a href="https://google.com">Hello</a>
         * <img src="https://cdn.thewirecutter.com/wp-content/media/2024/07/laptopstopicpage-2048px-3685-2x1-1.jpg?width=2048&quality=75&crop=2:1&auto=webp"/>
         * */

        //(7)//choosing option:
        /*
        System.out.println("""
                1.start
                2.stop
                3.exit
                """);
        System.out.println("-".repeat(10));
        System.out.println("insert option:");
        int opt = new Scanner(System.in).nextInt();
        if(opt<0){
            System.out.println("[!] Invalid option 😘 ");

        }else {
            switch (opt){
                case 1 -> System.out.println("this is option 1 ");
                case 2 -> System.out.println("This is option 2 ");
                case 3 -> System.out.println("This is option 3 ");
                case 4 -> System.out.println("This is option 4 ");
            }
        }
*/
//(8)using loop:
    /*    for (int i = 0; i < 5; i++) {
            System.out.println("hello ousa");
        }

     */

        /*System.out.println("insert number");
        int a = new Scanner(System.in).nextInt();
        int sum=0;
        for(int i=0; i<a; i++) {
            System.out.print((i + 1));
            if ((i + 1) != a) {
                System.out.print("+");

            } else {
                System.out.println("=");
            }
            sum = sum + (i + 1);
        }
        System.out.println(sum);
         */
    /*int a = 2;
        System.out.println(++a);// 1+a
        System.out.println(a++);// a+1
        System.out.println(a);// (a+1)+1

     */
       /* int a = 5;
        for(int i=0; i<5; i++){
            if(i>5){
              continue;
            }
            System.out.println(i);
        }

        */
      /*  System.out.println("""
                1.list all users
                2.create new user
                3.update user
                4.delete user5
                5.exit
                """);
        System.out.println("=".repeat(10));
        System.out.println("insert opt");
        int opt= new Scanner(System.in).nextInt();
        while (true){
            if(opt<0){
                System.out.println("[!] invalid option");
                System.out.println("insert option:");
                opt = new Scanner(System.in).nextInt();
            }else{
                break;
            }
        }

       */
        /* homework:
      1.  input email
       validate email first (@gmail.com)
        input password 8 characters.


        System.out.println("==========Email Validation==========");
        System.out.println("insert your email:");
        String email = new Scanner(System.in).nextLine();
        if(email.contains("@gmail.com")){
           // System.out.println("valid email");
       // }else {
          //  System.out.println("invalid email");
            System.out.print("Enter your password: ");
            Scanner scanner = new Scanner(System.in);


            String password = scanner.nextLine();

            if (password.length() > 8) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password must be more than 8 characters long.");
            }
            scanner.close();
    }

         */
        Scanner scanner = new Scanner(System.in);


        String email;
        while (true) {
            System.out.println("==========Email Validation==========");
            System.out.print("Insert your email: ");
            email = scanner.nextLine();

            if (email.contains("@gmail.com")) {
                System.out.println("Valid email.");
                break;
            } else {
                System.out.println("Invalid email. Please enter a valid Gmail address.");
            }
        }

        String password;
        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (password.length() > 8) {
                System.out.println("Password is valid.");
                break;
            } else {
                System.out.println("Password must be more than 8 characters long.");
            }
        }

        scanner.close();
}
}



