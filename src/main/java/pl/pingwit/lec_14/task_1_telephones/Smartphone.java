package pl.pingwit.lec_14.task_1_telephones;

public class Smartphone extends AbstractPhone{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall() {
        super.makeCall();
        System.out.println("Calling 911.");
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("You get a call from Grand mummy:)");
    }
}