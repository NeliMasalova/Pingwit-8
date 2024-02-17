package pl.pingwit.lec_14.task_1_telephones;

public class RotaryPhone extends AbstractPhone {
    public RotaryPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall() {
        System.out.println("Dealing on the rotary phone.");
    }

    @Override
    public void receiveCall() {
        System.out.println("Answering call on the rotary phone...");
    }
}