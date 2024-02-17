package pl.pingwit.lec_14.task_5_my_exception;

import java.util.Random;

public class Printer {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("Turn on.");
    }

    public void print(String document) throws MyException {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(document);
        } else {
            throw new MyException("Ошибка подключения. Проверьте настройки подключения устройства.");
        }
    }

    public void turnOff() {
        System.out.println("Turn off.");
    }
}