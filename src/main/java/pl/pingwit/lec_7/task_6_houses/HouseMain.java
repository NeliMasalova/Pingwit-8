package pl.pingwit.lec_7.task_6_houses;

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

        printByHouseTypeFilter(houses);

        switchHeating(houses, true);

        HouseCatalog houseCatalog = new HouseCatalog("Minsk", "Sucharevo", houses);
        System.out.println(houseCatalog);
    }

    private static int countTenantsMultiStoreyBuilding(House[] houses) {
        int sumTenants = 0;
        for (House house : houses) {
            if (HouseType.MULTI_STOREY_BUILDING == house.getType()) { //
                sumTenants += house.getTenants();
            }
        }
        return sumTenants;
    }

    private static void printByHouseTypeFilter(House[] houses) {
        for (House house : houses) {
            if (HouseType.INDIVIDUAL == house.getType()) {
                System.out.println(house);
            }
        }
    }

    private static void switchHeating(House[] houses, boolean heating) {
        for (House house : houses) {
            if (HouseType.MULTI_STOREY_BUILDING == house.getType() && house.getFloors() >= FLOOR_CONDITION) { // house.getType().equals(HouseType.MULTI_STOREY_BUILDING ->
                house.setHeating(heating);
            }
            System.out.println(house);
        }
    }
}
