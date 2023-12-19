package pl.pingwit.lec_6.Task_2_ParkingSystem;

public class ParkingSystem {
    public static void main(String[] args) {
        CarOwnerInformation carOwnerInformation1 = new CarOwnerInformation();
        carOwnerInformation1.setCarOwnerName("Robert");
        carOwnerInformation1.setCarOwnerSurname("Saniewski");
        carOwnerInformation1.setCarOwnerTelephone("508212130");
        carOwnerInformation1.setCarOwnerEmailAddress("r.saniewski@gmail.com");

        CarOwnerInformation carOwnerInformation2 = new CarOwnerInformation();
        carOwnerInformation2.setCarOwnerName("Barbara");
        carOwnerInformation2.setCarOwnerSurname("Smith");
        carOwnerInformation2.setCarOwnerTelephone("578930130");
        carOwnerInformation2.setCarOwnerEmailAddress("basiakownacka@gmail.com");

        CarOwnerInformation carOwnerInformation3 = new CarOwnerInformation();
        carOwnerInformation3.setCarOwnerName("Maria");
        carOwnerInformation3.setCarOwnerSurname("Ivanovskaya");
        carOwnerInformation3.setCarOwnerTelephone("558963326");
        carOwnerInformation3.setCarOwnerEmailAddress("ivanovska.mary@gmail.com");

        CarOwnerInformation carOwnerInformation4 = new CarOwnerInformation();
        carOwnerInformation4.setCarOwnerName("Adam");
        carOwnerInformation4.setCarOwnerSurname("Fisher");
        carOwnerInformation4.setCarOwnerTelephone("123478965");
        carOwnerInformation4.setCarOwnerEmailAddress("adam.fisher@gmail.com");

        CarOwnerInformation carOwnerInformation5 = new CarOwnerInformation();
        carOwnerInformation5.setCarOwnerName("Anna");
        carOwnerInformation5.setCarOwnerSurname("Kowalska");
        carOwnerInformation5.setCarOwnerTelephone("555623147");
        carOwnerInformation5.setCarOwnerEmailAddress("annuszka1987@gmail.com");

        CarInfo theFirstCar = new CarInfo("BIA-7978", carOwnerInformation1);
        CarInfo theSecondCar = new CarInfo("BI-32756", carOwnerInformation2);
        CarInfo theThirstCar = new CarInfo("NEL-31347", carOwnerInformation3);
        CarInfo theFourthCar = new CarInfo("WWA - 47236", carOwnerInformation4);
        CarInfo theFifthCar = new CarInfo("BIA-1902", carOwnerInformation5);

        String carInfoString1 = theFirstCar.toString();
        String carInfoString2 = theSecondCar.toString();
        String carInfoString3 = theThirstCar.toString();
        String carInfoString4 = theFourthCar.toString();
        String carInfoString5 = theFifthCar.toString();

        String[] carInfoArray = {carInfoString1, carInfoString2, carInfoString3, carInfoString4, carInfoString5};
        for (String s : carInfoArray) {
            System.out.println(s);
        }
    }
}