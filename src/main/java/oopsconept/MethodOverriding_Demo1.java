package oopsconept;

    class MethodOverriding_Demo1 {
    void sound(){
        System.out.println("The animal make a sound");
    }
    static class Dog extends MethodOverriding_Demo1
    {
        void sound(){
            System.out.println("The Dog barks");
        }}


        static class Cat extends MethodOverriding_Demo1{
        void sound(){
            System.out.println("The cat meows");

        }}

    public static void main(String[] args){
        MethodOverriding_Demo1 m1= new Dog();
        MethodOverriding_Demo1 m2= new Cat();

        m1.sound();
        m2.sound();

    }
    }


