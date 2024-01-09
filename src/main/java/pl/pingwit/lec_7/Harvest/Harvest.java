package pl.pingwit.lec_7.Harvest;

import java.math.BigDecimal;

public class Harvest {
    private long id;
    private String field;
    private String plant;
    private BigDecimal weight;

    public Harvest(long id, String field, String plant, BigDecimal weight) {
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "id=" + id +
                ", field='" + field + '\'' +
                ", plants='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}
