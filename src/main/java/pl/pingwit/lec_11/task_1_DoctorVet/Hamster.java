package pl.pingwit.lec_11.task_1_DoctorVet;

public class Hamster extends Pet {
    private final int cheekVolume;
    public Hamster(long id, String name, Owner owner, int cheekVolume) {
        super(id, name, owner);
        this.cheekVolume = cheekVolume;
    }
}