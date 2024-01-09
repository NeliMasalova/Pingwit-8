package pl.pingwit.lec_7.PersonInfo;

public class Person {
    private String name;
    private int age;
    private static String text = "Hello from static";

    {
        System.out.println("A new instance of the class has been created!");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getText() {
        return text;
    }

    public static String setText() {
        Person.text = text;
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}