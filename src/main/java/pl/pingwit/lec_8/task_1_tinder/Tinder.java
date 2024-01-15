package pl.pingwit.lec_8.task_1_tinder;

public class Tinder {
    private static final int AGE_CONDITION = 2006;

    public void suggestCouple(Person[] person) {
        for (Person value : person) {
            if ((FamilyStatus.SINGLE).equals(value.getFamilyStatus()) && value.getBirthYear() < AGE_CONDITION) {
                if ((Gender.FEMALE).equals(value.getGender())) {
                    System.out.println("Dear " + value.getName() + " " + value.getSurname() + "! We will help you find a man of your dreams.");
                } else {
                    System.out.println("Dear " + value.getName() + " " + value.getSurname() + "! Do you want to meet a girl?");
                }
            }
        }
    }
}