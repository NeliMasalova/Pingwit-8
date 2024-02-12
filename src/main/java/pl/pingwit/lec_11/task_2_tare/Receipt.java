package pl.pingwit.lec_11.task_2_tare;

import java.math.BigDecimal;

public class Receipt {
    private String message;
    private BigDecimal amount;

    public Receipt(String message, BigDecimal amount) {
        this.message = message;
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "message='" + message + '\'' +
                ", amount=" + amount +
                '}';
    }
}