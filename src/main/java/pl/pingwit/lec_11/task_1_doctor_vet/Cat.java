package pl.pingwit.lec_11.task_1_doctor_vet;

public class Cat extends Pet {
   private final String breed;

    public Cat(long id, String name, Owner owner, String breed) {
        super(id, name, owner);
        this.breed = breed;
    }

}