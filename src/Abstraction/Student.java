package Abstraction;

public class Student extends Person{

    public Student(){
        System.out.println("Student : Default Constructor");
    }
    public Student(String name, int age, String address, int rollNo){
        super(name,age,address);
        System.out.println("RollNo :"+rollNo);
    }

    public static void main(String[] args) {
        Student s=new Student("John",25,"New York",101);
    }
}
