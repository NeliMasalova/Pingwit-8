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

    public void print(String document) throws Exception {
        Random random = new Random();
        boolean b = random.nextBoolean();
        if (b) {
            System.out.println(document);
        } else {
            throw new Exception("Ошибка подключения. Проверьте настройки подключения устройства.");
        }
    }

    public void turnOff() {
        System.out.println("Turn off.");
    }
}