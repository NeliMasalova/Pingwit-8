package pl.pingwit.lec_14.task_1_telephones;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;
import java.util.Random;

public class Smartphone extends AbstractPhone{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall() {
        Random random = new Random();
        boolean isCalled = random.nextBoolean();
        if (isCalled){
            System.out.println("Calling 911.");
        } else{
            System.out.println("Sorry! The subscriber does not respond or is temporarily unavailable.");
        }
    }

    @Override
    public void receiveCall() {
        String contact = RandomStringUtils.randomAlphabetic(4, 10).toUpperCase(Locale.ROOT);
        System.out.println("You get a call from " + contact);
    }
}