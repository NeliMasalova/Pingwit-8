package pl.pingwit.lec_14.task_4_reverse_person;

public class FirstRealisation implements PersonReverser {
    @Override
    public Person reversePerson(Person person) {
        char[] reversedName = new char[person.getName().length()];
        char[] reversedSurname = new char[person.getSurname().length()];
        for (int i = 0; i < person.getName().length(); i++) {
            reversedName[i] = person.getName().charAt(person.getName().length() - 1 - i);
        }
        for (int i = 0; i < person.getSurname().length(); i++) {
            reversedSurname[i] = person.getSurname().charAt(person.getSurname().length() - 1 - i);
        }
        return new Person(new String(reversedName), new String(reversedSurname));
    }
}