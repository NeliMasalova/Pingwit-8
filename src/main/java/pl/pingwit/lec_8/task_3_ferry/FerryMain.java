package pl.pingwit.lec_8.task_3_ferry;

public class FerryMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("7874-CV", Type.CARGO, 15, 8),
                new Vehicle("1353-RT", Type.CARGO, 55, 14),
                new Vehicle("1353-RT", Type.PASSENGER_CAR, 1, 2),
                new Vehicle("9878-XC", Type.PASSENGER_CAR, 3, 3),
                new Vehicle("5555-BN", Type.PASSENGER_CAR, 2, 4),
        };

        FerryTicketOffice ticketOffice = new FerryTicketOffice();
        PaymentDTO paymentDTO = ticketOffice.calculateAmountPayment(vehicles);

        CheckFerryAccess checkFerryAccess = new CheckFerryAccess();
        Boolean isAllowed = checkFerryAccess.checkAccess(vehicles);

        System.out.println(paymentDTO);
        System.out.println(isAllowed);

    }
}