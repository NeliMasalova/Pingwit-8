package pl.pingwit.lec_8.task_3_ferry;

import java.math.BigDecimal;

public class FerryTicketOffice {
    private static final BigDecimal CARGO_TICKET_PRICE = BigDecimal.valueOf(30.0);
    private static final BigDecimal MIN_PASSENGER_CAR_PRICE = BigDecimal.valueOf(10.0);
    private static final BigDecimal MAX_PASSENGER_CAR_PRICE = BigDecimal.valueOf(15.0);
    private static final int NUMBER_OF_PASSENGERS = 2;

    public PaymentDTO calculateAmountPayment(Vehicle[] vehicles) {
        BigDecimal ticketPrice = BigDecimal.valueOf(0.0);
        BigDecimal amountPay = BigDecimal.valueOf(0.0);
        int passengers = 0;
        for (Vehicle vehicle : vehicles) {
            if (Type.CARGO == vehicle.getType()) {
                ticketPrice = CARGO_TICKET_PRICE;
            } else if ((Type.PASSENGER_CAR) == vehicle.getType() && vehicle.getBoardPeople() <= NUMBER_OF_PASSENGERS) {
                ticketPrice = MIN_PASSENGER_CAR_PRICE;
            } else if ((Type.PASSENGER_CAR) == vehicle.getType() && vehicle.getBoardPeople() > NUMBER_OF_PASSENGERS) {
                ticketPrice = MAX_PASSENGER_CAR_PRICE;
            }
            amountPay = amountPay.add(ticketPrice);
            passengers += vehicle.getBoardPeople();
        }
        PaymentDTO paymentDTO = new PaymentDTO(amountPay, passengers);
        return paymentDTO;
    }

}
