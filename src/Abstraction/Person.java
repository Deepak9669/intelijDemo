package Abstraction;

public class Person {

    public Person(){
        System.out.println("Person : Default Constructor");
    }
    public Person(String name){
        this();
        System.out.println("name :"+name);
    }
    public Person(String name, int age){
        this(name);
        System.out.println("age :"+age);
    }
    public Person(String name, int age, String address){
        this(name,age);
        System.out.println("address :"+address);
    }
}
