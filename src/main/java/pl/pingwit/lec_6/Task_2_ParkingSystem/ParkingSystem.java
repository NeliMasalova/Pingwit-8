package pl.pingwit.lec_6.Task_2_ParkingSystem;

public class ParkingSystem {
    public static void main(String[] args) {
        OwnerInformation robertLewandowski = new OwnerInformation();
        robertLewandowski.setName("Robert");
        robertLewandowski.setSurname("Lewandowski");
        robertLewandowski.setPhone("508212130");
        robertLewandowski.setEmail("r.lewandowski@gmail.com");

        OwnerInformation barbaraSmith = new OwnerInformation();
        barbaraSmith.setName("Barbara");
        barbaraSmith.setSurname("Smith");
        barbaraSmith.setPhone("578930130");
        barbaraSmith.setEmail("basiakownacka@gmail.com");

        OwnerInformation mariaIvanovskaya = new OwnerInformation();
        mariaIvanovskaya.setName("Maria");
        mariaIvanovskaya.setSurname("Ivanovskaya");
        mariaIvanovskaya.setPhone("558963326");
        mariaIvanovskaya.setEmail("ivanovska.mary@gmail.com");

        OwnerInformation adamFisher = new OwnerInformation();
        adamFisher.setName("Adam");
        adamFisher.setSurname("Fisher");
        adamFisher.setPhone("123478965");
        adamFisher.setEmail("adam.fisher@gmail.com");

        OwnerInformation annaKowalska = new OwnerInformation();
        annaKowalska.setName("Anna");
        annaKowalska.setSurname("Kowalska");
        annaKowalska.setPhone("555623147");
        annaKowalska.setEmail("annuszka1987@gmail.com");

        CarInfo landRoverDiscovery = new CarInfo("BIA-7978", robertLewandowski);
        CarInfo toyotaTundra = new CarInfo("BI-32756", barbaraSmith);
        CarInfo opelCorsa = new CarInfo("NEL-31347", mariaIvanovskaya);
        CarInfo toyotaPrius = new CarInfo("WWA-47236", adamFisher);
        CarInfo mazdaRX8 = new CarInfo("BIA-1902", annaKowalska);

        CarInfo[] cars = {landRoverDiscovery, toyotaTundra, opelCorsa, toyotaPrius, mazdaRX8};
        for (CarInfo car : cars) {
            System.out.println(car);
        }
    }
}