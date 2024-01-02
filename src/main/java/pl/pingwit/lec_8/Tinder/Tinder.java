package pl.pingwit.lec_8.Tinder;

public class Tinder {

    public static final int AGE_CONDITION = 2006;

    public static void suggestCouple(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            if (person[i].getFamilyStatus().equals(FamilyStatus.SINGLE) && person[i].getBirthYear() < AGE_CONDITION) {
                if (person[i].getGender().equals(Gender.FEMALE)) {
                    System.out.println("Dear " + person[i].getName() + " " + person[i].getSurname() + "! We will help you find the man of your dreams.");
                } else {
                    System.out.println("Dear " + person[i].getName() + " " + person[i].getSurname() + "! Do you want to meet a girl?");
                }
            }
        }
    }
}