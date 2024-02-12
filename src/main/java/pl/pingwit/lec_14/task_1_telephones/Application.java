package pl.pingwit.lec_14.task_1_telephones;

public class Application {
    public static void main(String[] args) {
        RotaryPhone rotaryPhone = new RotaryPhone("Bell", "2000");
        RadioPhone radioPhone = new RadioPhone("Spy", "3000");
        MobilePhone mobilePhone = new MobilePhone("SonyEricsson", "W710i");
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S10");

        rotaryPhone.makeCall();
        rotaryPhone.receiveCall();

        System.out.println("_________________");

        radioPhone.makeCall();
        radioPhone.receiveCall();

        System.out.println("_________________");

        mobilePhone.makeCall();
        mobilePhone.receiveCall();

        System.out.println("_________________");

        smartphone.makeCall();
        smartphone.receiveCall();
    }
}