/*public class Person {
    public int id;
    public String name;
    public int age;

    public void getName(){
        System.out.println(name);
    }
    public void getId(){
        System.out.println(id);
    }
}

 */
public class Person{
    private int id;
    private String name;
    private int age;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
