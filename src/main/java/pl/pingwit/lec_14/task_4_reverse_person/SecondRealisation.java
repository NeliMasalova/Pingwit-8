package pl.pingwit.lec_14.task_4_reverse_person;

import org.apache.commons.lang3.StringUtils;

public class SecondRealisation implements PersonReverser {
    @Override
    public Person reversePerson(Person person) {
        String reversedName = StringUtils.reverse(person.getName());
        String reversedSurname = StringUtils.reverse(person.getSurname());
        return new Person(reversedName, reversedSurname);
    }
}