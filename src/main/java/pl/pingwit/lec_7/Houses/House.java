package pl.pingwit.lec_7.Houses;

public class House {
    private String type;
    private int floors;
    private int tenants;
    private boolean heating;

    public House(String type, int floors, int tenants, boolean heating) {
        this.type = type;
        this.floors = floors;
        this.tenants = tenants;
        this.heating = heating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getTenants() {
        return tenants;
    }

    public void setTenants(int tenants) {
        this.tenants = tenants;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    @Override
    public String toString() {
        return "HousesClass{" +
                "type='" + type + '\'' +
                ", floors=" + floors +
                ", tenants=" + tenants +
                ", isHeated=" + heating +
                '}';
    }
}
