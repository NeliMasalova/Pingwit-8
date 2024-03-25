package pl.pingwit.lec_22.task_3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

public class Receipt {
    private Map<Product, Integer> items;
    private BigDecimal totalPayment;
    private LocalDate date;
    private LocalDate time;

    public Receipt(Map<Product, Integer> items, BigDecimal totalPayment, LocalDate date, LocalDate time) {
        this.items = items;
        this.totalPayment = totalPayment;
        this.date = date;
        this.time = time;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Product, Integer> items) {
        this.items = items;
    }

    public BigDecimal getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(BigDecimal totalPayment) {
        this.totalPayment = totalPayment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(items, receipt.items) && Objects.equals(totalPayment, receipt.totalPayment) && Objects.equals(date, receipt.date) && Objects.equals(time, receipt.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, totalPayment, date, time);
    }
}
