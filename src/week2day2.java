import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//public class week2day2 {
  //  public static void main(String[] args) {

        //review
       /* int [][] metric = new int[2][];
        metric[0] = new int[2];
        metric[1] = new int[3];
       */
        //method
     /*   static int sum(int []a){
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum = sum + a[i];
            }
            return sum;
        }
    static int max(int[] a) {
        int max = a[0];  // Start by assuming the first element is the max
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];  // Update max if the current element is larger
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {3,4,5,6,7,8};


       // System.out.println("Sum of a: " + sum(a));
        System.out.println("Max of a: " + max(a));

       // System.out.println("Sum of b: " + sum(b));
        System.out.println("Max of b: " + max(b));//calling max method

        /*method have 4 types: return type + parameter
                                return type + no prameter

         */
        /* static void test() {
             System.out.println("===========================");
             System.out.println("             welcome        ");
             System.out.println("===========================");

        }
        static String emailValidate(String email){
             while (true){
                 if(email.contains("@gmail.com")){
                     return "valid email";
                 }
                 System.out.println("invalid");
             }

        }
       static Boolean compare(int a, int b){
             if(a>b){
                 return true;
             }
             return false;
        }



    public static void main(String[] args) {
       System.out.println(compare(1,2));//it's failed cuz 1 not bigger than 2
        System.out.println(emailValidate("ousa@mail.com"));

         */
    /*
        static int sum(int []a){
            int sum=0;
            for(int i=0;i<a.length;i++){
                sum = sum + a[i];
            }
            return sum;
        }
    static Integer max(int []s){
        int value = s[0];
        for(int i=0;i<s.length;i++){
            if(value<s[i]){
                value = s[i];//logic/
            }
        }
        return value;
    }
    static void test(){
        System.out.println("===============================");
        System.out.println("            Welcome            ");
        System.out.println("===============================");
    }
    static String emailValidateFromCambodia(String email){
        if(email.contains("@gmail.com")){
            return "Valid email";
        }
        return "Invalid email";
    }
    public static void main(String[] args) {

        System.out.println(emailValidateFromCambodia("koko@gmail.com"));


*/
    /*
    //currency check
        static void sort(int []a){
            Arrays.sort(a);
        }
        static Double currencyCheck(){
            LocalDate localDate = LocalDate.of(2024,10,2);
            LocalDate now = LocalDate.now();
            if(localDate.isBefore(now)){
                return 4150.00;
            }
            return 4000.0;
        }

            public static void main(String[] args) {
                System.out.println(currencyCheck());

     */
    /*
    static String[] nameChecker (String [] names){
        String [] result = new String[names.length];
        for(int i=0; i<names.length; i++){
            if(names[i].startsWith("O") || names[i].startsWith("o")){
                result[i] = names[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names= {"sasa","ousa","ousa sa"};
        System.out.println(Arrays.toString(nameChecker(names)));

     */
    /*
    static String[] searchMethod(String[] names, String name) {
        String[] results = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains(name.toLowerCase()) ||
                    names[i].equalsIgnoreCase(name)) {
                results[i] = names[i];
            }
        }
            return results;
        }

        static void ui(){
            System.out.println("=".repeat(20));
            System.out.println("welcome to feedback search");
            System.out.println("=".repeat(20));
        }
        static void option(){
            ui();
            System.out.print("[+] Insert name to search: ");
            String name = new Scanner(System.in).nextLine();
            String [] names = {"Kimhout",
                    "Tongei", "Somnang","Meas Serei Sophaktra",
                    "Neang Tanglim","Te Senglong","TIEM SOROTT","Sam Ousa"};

            String results[] = searchMethod(names, name);
            System.out.println("[+] All people you may search for: ");
            for(String n: results){
                System.out.print(n + " | ");
            }

        }
        public static void main(String[] args){
            option();



public class week2day2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for(int i=0; i<numbers.length;i++){
            System.out.println("insrt number:");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        while(true){
            System.out.println(Arrays.toString(numbers));
            System.out.println("insert element position to update");
            int index = new Scanner(System.in).nextInt();
            if(index<0 || index>numbers.length){
                System.out.println("invalid index");
            }else {
                System.out.println("insert value to update on element at index-"+ index+ ":");
                int newNumber = new Scanner(System.in).nextInt();
                numbers[index] = newNumber;
                System.out.println("=".repeat(20));}
            System.out.println("new array update: \n"+ Arrays.toString(numbers));
        }

     */
/*
        public class week2day2 {
            public static void main(String[] args) {
                String[] names = new String[5];
                Scanner scanner = new Scanner(System.in);

                for(int i = 0; i < names.length; i++) {
                    System.out.println("Insert name:");
                    names[i] = scanner.nextLine();
                }

                while(true) {
                    System.out.println(Arrays.toString(names));
                    System.out.println("Insert element position to update:");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if(index < 0 || index >= names.length) {
                        System.out.println("Invalid index");
                    } else {
                        System.out.println("Insert name to update at index " + index + ":");
                        String newName = scanner.nextLine();
                        names[index] = newName;
                        System.out.println("=".repeat(20));
                    }

                    System.out.println("Updated array: \n" + Arrays.toString(names));
                }
            }
        }

 */



import java.util.Arrays;
import java.util.Scanner;

public class week2day2{
    static String [] names = {"Sokpheng","Kimhout","Somnang","Tongei"};
    static String isNameExisted(String name){
        for(int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                System.out.print("[+] INsert new name for update: ");
                String newName = new Scanner(System.in).nextLine();
                names[i] = newName;
                return newName;
            }
        }
        return null;
    }
    static void updateName(){
        System.out.print("[+] Search for name in order to update: ");
        String name = new Scanner(System.in).nextLine();
        String newName = isNameExisted(name);
        if(newName==null){
            System.out.println("[!] No user to update by name");
        }
    }
    public static void main(String[] args) {
        Arrays.stream(names).forEach(e->{
            System.out.println(e);
        });
        updateName();
        Arrays.stream(names).forEach(System.out::println);
    }
}
/* home work
seach name then update new name
 */
/* review lessons
    method 4 types:
    static void get(){};
    static void play(int speed, String data){}
    static int getInValue(){return 0;}
    static String getString(String data,){
        return "";
        }
    public static void main
 */





