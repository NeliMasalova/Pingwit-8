package pl.pingwit.lec_14.task_3_wifi;

import java.io.IOException;
import java.util.Random;

public class Router {
    private String name;
    private String networkName;

    public Router(String name, String networkName) {
        this.name = name;
        this.networkName = networkName;
    }

    public void connectWiFi(String deviceName) throws IOException {
        Random random = new Random();
        boolean isConnected = random.nextBoolean();

        if (isConnected) {
            System.out.println("Устройство " + deviceName + " подключено к сети " + networkName + ".");
        } else {
            throw new IOException("Ошибка подключения: невозможно соединиться с Wi-Fi.");
        }
    }
}
