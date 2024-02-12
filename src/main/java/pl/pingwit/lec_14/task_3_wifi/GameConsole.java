package pl.pingwit.lec_14.task_3_wifi;

public class GameConsole {
    private String deviceName;
    private String model;

    public GameConsole(String deviceName, String model) {
        this.deviceName = deviceName;
        this.model = model;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "deviceName='" + deviceName + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
