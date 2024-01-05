package pl.pingwit.lec_8.Ferry;

import java.util.Objects;

public class Vehicle {
    private String licensePlate;
    private Type type;
    private int boardPeople;
    private int weight;

    public Vehicle(String licensePlate, Type type, int boardPeople, int weight) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.boardPeople = boardPeople;
        this.weight = weight;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getBoardPeople() {
        return boardPeople;
    }

    public void setBoardPeople(int boardPeople) {
        this.boardPeople = boardPeople;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return boardPeople == vehicle.boardPeople && weight == vehicle.weight && Objects.equals(licensePlate, vehicle.licensePlate) && type == vehicle.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate, type, boardPeople, weight);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", type=" + type +
                ", boardPeople=" + boardPeople +
                ", weight=" + weight +
                '}';
    }
}
