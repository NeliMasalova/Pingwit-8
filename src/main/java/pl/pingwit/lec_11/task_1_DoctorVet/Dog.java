package pl.pingwit.lec_11.task_1_DoctorVet;

public class Dog extends Pet {
    private final String tailLength;

    public Dog(long id, String name, Owner owner, String tailLength) {
        super(id, name, owner);
        this.tailLength = tailLength;
    }
}