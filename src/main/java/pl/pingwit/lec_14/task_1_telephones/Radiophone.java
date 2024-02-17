package pl.pingwit.lec_14.task_1_telephones;

import org.apache.commons.lang3.RandomStringUtils;

public class Radiophone extends AbstractPhone {
    public Radiophone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall() {
        String phoneNumber = RandomStringUtils.randomNumeric(9, 9);
        System.out.println("The call is set with the number: " + phoneNumber);
    }

    @Override
    public void receiveCall() {
        System.out.println("Incoming call!");
    }
}