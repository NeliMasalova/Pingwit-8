package pl.pingwit.lec_8.Ferry;

import java.math.BigDecimal;

public class FerryTicketOffice {
    public static final BigDecimal CARGO_TICKET_PRICE = BigDecimal.valueOf(30.0);
    public static final BigDecimal MIN_PASSENGER_CAR_PRICE = BigDecimal.valueOf(10.0);
    public static final BigDecimal MAX_PASSENGER_CAR_PRICE = BigDecimal.valueOf(15.0);
    public static final int NUMBER_OF_PASSENGERS = 2;

    public static void calculateAmountPayment(Vehicle[] vehicles) {
        BigDecimal ticketPrice = BigDecimal.valueOf(0.0);
        BigDecimal amountPay = BigDecimal.valueOf(0.0);
        int passengers = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getType().equals(Type.CARGO)) {
                ticketPrice = CARGO_TICKET_PRICE;
            } else if (vehicles[i].getType().equals(Type.PASSENGER_CAR) && vehicles[i].getBoardPeople() <= NUMBER_OF_PASSENGERS) {
                ticketPrice = MIN_PASSENGER_CAR_PRICE;
            } else if (vehicles[i].getType().equals(Type.PASSENGER_CAR) && vehicles[i].getBoardPeople() > NUMBER_OF_PASSENGERS) {
                ticketPrice = MAX_PASSENGER_CAR_PRICE;
            }
            amountPay = ticketPrice.add(amountPay);
            passengers += vehicles[i].getBoardPeople();
        }
        System.out.println("The number of passengers on the ferry is " + passengers + ".");
        System.out.print("The amount of payments is " + amountPay + " EURO.");
    }
}
