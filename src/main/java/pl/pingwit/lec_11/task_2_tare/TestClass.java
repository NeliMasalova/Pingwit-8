package pl.pingwit.lec_11.task_2_tare;

public class TestClass {
    public static void main(String[] args) {
        Animal animal = new Cat();
        display(animal);
        animal = new Dog();
        display(animal);
    }

    private static void display(Animal animal) {
        animal.feed();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.sleep();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.sleep();
        }
    }
}

interface Animal {
    void feed();
}

class Cat implements Animal {
    @Override
    public void feed() {
        System.out.println("Cat is feeding.");
    }

    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
}

class Dog implements Animal {
    @Override
    public void feed() {
        System.out.println("Dog is feeding.");
    }

    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
