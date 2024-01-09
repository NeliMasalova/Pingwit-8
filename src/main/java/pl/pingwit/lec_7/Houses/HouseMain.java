package pl.pingwit.lec_7.Houses;

public class HouseMain {
    public static final int FLOOR_CONDITION = 5;

    public static void main(String[] args) {
        House[] houses = {
                new House(HouseType.INDIVIDUAL, 2, 5, true),
                new House(HouseType.MULTI_STOREY_BUILDING, 15, 93, false),
                new House(HouseType.MULTI_STOREY_BUILDING, 11, 80, false),
                new House(HouseType.INDIVIDUAL, 3, 8, true),
                new House(HouseType.MULTI_STOREY_BUILDING, 17, 104, false)
        };

        int sumTenants = countTenantsMultiStoreyBuilding(houses);
        System.out.println("Total tenants of multi-storey buildings is " + sumTenants + ".");

        printIndividualHouses(houses);

        switchHeating(houses, true);

        HouseCatalog houseCatalog = new HouseCatalog("Minsk", "Sucharevo", houses);
        System.out.println(houseCatalog);
    }

    private static int countTenantsMultiStoreyBuilding(House[] houses) {
        int sumTenants = 0;
        for (House house : houses) {
            if (house.getType().equals(HouseType.MULTI_STOREY_BUILDING)) {
                sumTenants += house.getTenants();
            }
        }
        return sumTenants;
    }

    private static void printIndividualHouses(House[] houses) {
        for (int i = 0; i < houses.length; i++) {
            House house = houses[i];
            if (house.getType().equals(HouseType.INDIVIDUAL)) {
                System.out.println(house);
            }
        }
    }
    private static void switchHeating(House[] houses, boolean toggle) {
        for (House house : houses) {
            if (house.getType().equals(HouseType.MULTI_STOREY_BUILDING) && house.getFloors() >= FLOOR_CONDITION) {
                house.setHeating(toggle);
            }
            System.out.println(house);
        }
    }
}