package pl.pingwit.lec_8.task_3_ferry;

import java.math.BigDecimal;

public class PaymentDTO {
    private BigDecimal amountPay;
    private int passengers;

    public PaymentDTO(BigDecimal amountPay, int passengers) {
        this.amountPay = amountPay;
        this.passengers = passengers;
    }

    public BigDecimal getAmountPay() {
        return amountPay;
    }

    public void setAmountPay(BigDecimal amountPay) {
        this.amountPay = amountPay;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "amountPay=" + amountPay +
                ", passengers=" + passengers +
                '}';
    }
}
