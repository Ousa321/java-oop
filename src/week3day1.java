import java.util.ArrayList;

public class week3day1 {
    /*
     static void printValue(int...n) {

         //print lots of number in one

        for(int a: n ) {
         System.out.println(a);

         }
    }

    public static void main(String[] args) {
        printValue(1,3,3,5,4,5,45,4,5,23);

          */
    public static void main(String[] args) {
         ArrayList<Integer> arrayList = new ArrayList<>();
         arrayList.add(1);
         arrayList.add(2);
         arrayList.add(3);
         for(Integer n: arrayList){
             System.out.println(n);
         }
    }
}




