package pl.pingwit.lec_8.task_1_tinder;

public class Tinder {
    private static final int AGE_CONDITION = 2006;

    public void applyForm(Person[] persons) {
        for (Person person : persons) {
            if (FamilyStatus.SINGLE == person.getFamilyStatus() && person.getBirthYear() < AGE_CONDITION) {
                if (Gender.FEMALE == person.getGender()) {
                    System.out.println("Dear " + person.getName() + " " + person.getSurname() + "! We will help you find a man of your dreams.");
                } else {
                    System.out.println("Dear " + person.getName() + " " + person.getSurname() + "! Do you want to meet a girl?");
                }
            }
        }
    }
}