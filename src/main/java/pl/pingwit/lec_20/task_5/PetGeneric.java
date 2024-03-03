package pl.pingwit.lec_20.task_5;

import pl.pingwit.lec_11.task_1_doctor_vet.Pet;

public class PetGeneric<T extends Pet>{
    private T[] pets;

    public PetGeneric(T[] pets) {
        this.pets = pets;
    }

    public T[] getPets() {
        return pets;
    }
}