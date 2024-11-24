import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


public class week2day1 {
    public static void main(String[] args) {
    /*    int[] number  = new int[5];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;//assign



       // String names[]= new String[5];
       // names[0]="öusa";
        //names[1]="sasa";
        //or
        String names[] = {"ousa","kaka"}; // initialization
        names[0] ="Apple"; //assign
        System.out.println(Arrays.toString(names));


        String names[] = new String[2];
        for(int i=0; i<names.length;i++){
            System.out.println("insert name ["+i+"]:");
            names[i]= new Scanner(System.in).nextLine();
        }
        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }

        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
           // System.out.println("insert name [" + i + "]:");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        //Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
           // if (numbers[i] % 2 == 0) { //if it devide 2 it is even num
            System.out.println(numbers[i]);
            }

*/

    //update value
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
        /*
     // 1+2+3+..+=
        int []numbers = {1,2,3,4,5,6};
        int sum=0;
        for(int i=0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println("Sum: "+ sum);
        System.out.println("Average:"+(float)sum/numbers.length);


        int [][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 1;
        numbers[0][2] = 1;
        numbers[1][0] = 1;
        for(int i=0; i<numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + "?");
            }
            System.out.println();
        }


        String[][] students = new String[2][3];
        students[0][0] = "me";
        students[0][1] = "myself";
        students[0][2] = "i";
        students[1][0] = "ousa";
        students[1][1] = "sasa";
        students[1][2] = "ousa sa";

        for (int i = 0; i < students.length; i++) {// number of row
            for (int j = 0; j < students[0].length; j++) {// number of column
                System.out.print(students[i][j] + " | ");
            }
            System.out.println();


        }


        System.out.println("insert row:");
        int row = new Scanner(System.in).nextInt();
        System.out.println("insert colum:");
        int column = new Scanner(System.in).nextInt();

        String[][] students = new String[row][column];
        //insert
        for (int i = 0; i < students.length; i++) {// number of row
            for (int j = 0; j < students[0].length; j++) {//number of column
                System.out.println("insert student's name[" + i + "]" + "[" + j + "]:");
                students[i][j] = new Scanner(System.in).nextLine();

            }
        }
        System.out.println(Arrays.deepToString(students));
        //print
        for(int i=0; i<students.length;i++){
            for(int j=0; j<students[0].length; j++){
                System.out.print(students[i][j]+"|");
                System.out.print("|");
            }
            System.out.println();
        }

     */
        //double pricing = {{1,2},{1,2}}
    }
}