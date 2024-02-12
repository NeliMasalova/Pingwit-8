package pl.pingwit.lec_11.task_1_doctor_vet;

import java.util.Objects;

public class Pet {
    protected final long id;
    protected final String name;
    protected final Owner owner;

    public Pet(long id, String name, Owner owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public final String petCard() {
        return String.format("The pet %s is belong to %s %s. The pet's owner contacts are %s and %s.",
                name,
                owner.name(),
                owner.surname(),
                owner.telephone(),
                owner.email());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id == pet.id && Objects.equals(name, pet.name) && Objects.equals(owner, pet.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, owner);
    }

    @Override
    public String toString() {
        return "PetInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", petOwner=" + owner +
                '}';
    }
}