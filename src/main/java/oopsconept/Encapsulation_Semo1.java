package oopsconept;

public class Encapsulation_Semo1 {

   private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age>18){
            this.age= age;
        }else{
            System.out.println("You are not an adult");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args){
        Encapsulation_Semo1 e1 =new Encapsulation_Semo1();
        e1.setName("Adithya");
        e1.setAge(80);
        System.out.println(e1.getAge());
        System.out.println(e1.getName());
    }
}
