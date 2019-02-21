public class Person {

    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
