package Eancapsulation;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempt to set a negative age
        person.setAge(-5); // This should trigger the validation message
    }
}
