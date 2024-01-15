package pl.pingwit.lec_7.task_1_personInfo;

public class PersonArray {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Harry Potter", 17),
                new Person("Lord Voldemort", 71),
                new Person("Albus Dumbledore", 115),
                new Person("Draco Malfoy", 17),
                new Person("Sirius Black", 36),
        };
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}