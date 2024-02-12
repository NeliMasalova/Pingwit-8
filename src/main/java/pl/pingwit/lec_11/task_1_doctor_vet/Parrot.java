package pl.pingwit.lec_11.task_1_doctor_vet;

public class Parrot extends Pet {
   private final String color;

    public Parrot(long id, String name, Owner owner, String color) {
        super(id, name, owner);
        this.color = color;
    }
}