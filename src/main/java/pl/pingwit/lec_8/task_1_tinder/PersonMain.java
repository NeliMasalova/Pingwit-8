package pl.pingwit.lec_8.task_1_tinder;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Harry", "Potter", 1980, Gender.MALE, FamilyStatus.MARRIED),
                new Person("Monika", "Bellucchi", 1964, Gender.FEMALE, FamilyStatus.SINGLE),
                new Person("Antony", "Brown", 1993, Gender.MALE, FamilyStatus.SINGLE),
                new Person("Maria Victoria", "Applestone", 2005, Gender.FEMALE, FamilyStatus.SINGLE),
                new Person("Erich Maria", "Remarque", 1898, Gender.MALE, FamilyStatus.SINGLE),
                new Person("Arianna", "Gold", 2007, Gender.FEMALE, FamilyStatus.SINGLE),
        };

        Tinder tinder = new Tinder();
        tinder.applyForm(persons);
    }
}
