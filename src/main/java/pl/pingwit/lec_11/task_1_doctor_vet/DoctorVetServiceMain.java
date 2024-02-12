package pl.pingwit.lec_11.task_1_doctor_vet;

public class DoctorVetServiceMain {
    public static void main(String[] args) {
        Owner catOwner = new Owner("Piter", "Black", "+375292929478", "black@gmail.com");
        Owner dogOwner = new Owner("Julia", "Roberts", "+48789654123", "roberts.j@hotmail.com");
        Owner hamsterOwner = new Owner("Betty", "Boomer", "+3752147589632", "beautybetty@gmail.com");
        Owner parrotOwner = new Owner("Olivia", "Randolf", "+4878236956", "oliviawhite@gmail.com");

        Pet[] pets = {
                new Cat(1234789L, "Sirius", catOwner, "Maine-Coon"),
                new Dog(2455789L, "Ralph", dogOwner, "no tail"),
                new Parrot(3589645L, "Ara", parrotOwner, "red, yellow, green, blue"),
                new Hamster(6745236L, "Fluffy", hamsterOwner, 7)
        };

        for (Pet pet : pets) {
            System.out.println(pet.petCard());
        }
    }
}