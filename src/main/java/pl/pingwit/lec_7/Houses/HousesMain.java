package pl.pingwit.lec_7.Houses;

public class HousesMain {
    public static void main(String[] args) {
        House[] houses = {
                new House("Individual", 2, 5, true),
                new House("Multi-storey building", 15, 93, false),
                new House("Multi-storey building", 11, 80, false),
                new House("Individual", 3, 8, true),
                new House("Multi-storey building", 17, 104, false)
        };

        int sumTenants = countTenantsMultiStoreyBuilding(houses);
        System.out.println("Total tenants of multi-storey buildings is " + sumTenants + ".");

        printIndividualHouses(houses);
        switchHeating(houses, true);
    }

    private static int countTenantsMultiStoreyBuilding(House[] houses) {
        int sumTenants = 0;
        for (House house : houses) {
            if (house.getType().equals("Multi-storey building")) {
                sumTenants += house.getTenants();
            }
        }
        return sumTenants;
    }

    private static void printIndividualHouses(House[] houses) {
        for (House house : houses) {
            if (house.getType().equals("Individual")) {
                System.out.println(house);
            }
        }
    }

    private static void switchHeating(House[] houses, boolean toggle) {
        for (House house : houses) {
            if (house.getType().equals("Multi-storey building") && house.getFloors() >= 5) {
                house.setHeating(toggle);
            }
            System.out.println(house);
        }
    }
}