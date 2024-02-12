package pl.pingwit.lec_14.task_3_wifi;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Router router = new Router("TP-Link_14Te7", "The Smith's home");
        GameConsole gameConsole = new GameConsole("Playstation", "PSP5");

        try {
            router.connectWiFi(gameConsole.getDeviceName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}