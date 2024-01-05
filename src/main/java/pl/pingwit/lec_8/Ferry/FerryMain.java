package pl.pingwit.lec_8.Ferry;

public class FerryMain {
    public static void main(String[] args) {
        Vehicle [] vehicles = {
                new Vehicle("7874-CV", Type.CARGO, 15, 8),
                new Vehicle("1353-RT", Type.CARGO, 55, 14),
                new Vehicle("1353-RT", Type.PASSENGER_CAR, 1, 2),
                new Vehicle("9878-XC", Type.PASSENGER_CAR, 3, 3),
                new Vehicle("5555-BN", Type.PASSENGER_CAR, 2, 4),
                new Vehicle("0000-OO", Type.PASSENGER_CAR, 4, 5),
                new Vehicle("9173-QB", Type.CARGO, 33, 10),
                new Vehicle("1070-KB", Type.CARGO, 18, 8),
                new Vehicle("4682-BC", Type.PASSENGER_CAR, 5, 4),
                new Vehicle("1313-TT", Type.PASSENGER_CAR, 3, 3),
                new Vehicle("4973-RR", Type.CARGO, 61, 10),
                new Vehicle("1515-AC", Type.PASSENGER_CAR, 1, 5),
        };
        FerryTicketOffice.calculateAmountPayment(vehicles);
        System.out.println();
        CheckFerryAccess.checkAccess(vehicles);
    }
}
