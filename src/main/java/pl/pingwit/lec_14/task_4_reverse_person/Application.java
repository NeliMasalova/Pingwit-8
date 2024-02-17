package pl.pingwit.lec_14.task_4_reverse_person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Harry", "Potter");
        Person person2 = new Person("Harry", "Potter");

        PersonReverser charArrayReverser = new ArrayPersonReverser();
        PersonReverser stringUtilsReverser = new StringUtilsPersonReverser();

        System.out.println(charArrayReverser.reversePerson(person));
        System.out.println(stringUtilsReverser.reversePerson(person2));
    }
}