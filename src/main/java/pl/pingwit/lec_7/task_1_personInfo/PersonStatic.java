package pl.pingwit.lec_7.task_1_personInfo;

public class PersonStatic {
    public static void main(String[] args) {
        Person harryPotter = new Person("Harry Potter", 17);
        Person volandemort = new Person("Lord Volandemort", 71);
        System.out.println(harryPotter.getText());
        harryPotter.setText("Avada Kedavra!");
        System.out.println(volandemort.getText());
        System.out.println(harryPotter.getText());
    }
}