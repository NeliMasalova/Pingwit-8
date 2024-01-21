package pl.pingwit.lec_11.task_1_DoctorVet;

public class Parrot extends Pet {
   private final String color;

    public Parrot(long id, String name, Owner owner, String color) {
        super(id, name, owner);
        this.color = color;
    }
}