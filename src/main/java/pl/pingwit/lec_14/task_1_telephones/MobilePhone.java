package pl.pingwit.lec_14.task_1_telephones;

public class MobilePhone extends AbstractPhone{
    public MobilePhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall() {
        String contact = "Granny";
        System.out.println("Calling " + contact);

    }

    @Override
    public void receiveCall() {
        String contact = "Mummy";
        System.out.println("You get a call from " + contact);
    }
}
