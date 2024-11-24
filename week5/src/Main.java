import model.Product;
import util.MathHelper;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
    /*public static void main(String[] args) {
        Student person1 = new Student();
        person1.id = new Random().nextInt(5)+1;
        person1.name = "ousa";
        person1.age = 20;

      //  person1.getName();
        System.out.println(person1);
     */
  //  public static void main(String[] koko) {
        /*Person person = new Person();
        person.setId(99);
        person.setName("ousa");
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person);

         */
      /*  User user = new User();
        user.setId(12);
        user.setUsername("ousa sa");
        user.setEmail("ousa@gmail.com");
        user.setPassord("23222");

        System.out.println(user.getId());
        System.out.println(user.getEmail());
        System.out.println(user.getUsername());
        System.out.println(user.getPassord());
        System.out.println(user);
    }


        Product product = new Product();
        product.setId(2222);
        product.setProductName("Burger");
        product.setPrice(2.5);
        product.setDescription("yummy");

        product.setExpiration(LocalDateTime.of(24, 11,20,6,7));
        product.setImage("https://www.bing.com/images/search?view=detailV2&ccid=KomAB7rg&id=055B5E4E47EB06C85A6B64F5364C3BC228C3AE46&thid=OIP.KomAB7rg-OCyK3QEDO81fwHaEn&mediaurl=https%3a%2f%2fcmx.weightwatchers.com%2fassets-proxy%2fweight-watchers%2fimage%2fupload%2fv1594406683%2fvisitor-site%2fprod%2fca%2fburgers_mobile_my18jv&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.2a898007bae0f8e0b22b74040cef357f%3frik%3dRq7DKMI7TDb1ZA%26pid%3dImgRaw%26r%3d0&exph=3410&expw=5472&q=buger&FORM=IRPRST&ck=862146FAF9F3F245C57332A58894AEF4&selectedIndex=0&itb=0");

        System.out.println(product.getId());
        System.out.println(product.getProductName());
        System.out.println(product.getImage());
        System.out.println(product.getPrice());
        System.out.println(product.getExpiration());



    }

       */
/*
        MathHelper mathHelper = new MathHelper();
        System.out.println(mathHelper.sum(1,2));
        System.out.println(mathHelper.sum(1.1, 2.2));

 */
        class Person1{
            public void speak(){
                System.out.println("person speak");
            }
        }
        class Teacher extends Person1{
            @Override
            public void speak() {
                super.speak();
                System.out.println("teacher speak");
            }
        }
        class Student extends Person1 {
            @Override //
            public void speak(){
                System.out.println("Student speaks");
            }
        }
      public class Main{
          public static void main(String[] args) {
              Person1 person = new Person1();
              person.speak();
              Teacher teacher = new Teacher();
              teacher.speak();
              Student student = new Student();
              student.speak();
          }
    }
