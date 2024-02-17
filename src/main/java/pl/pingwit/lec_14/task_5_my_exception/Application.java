package pl.pingwit.lec_14.task_5_my_exception;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer("Kyocera 3000");
        printer.turnOn();

       /* try {
            printer.print("Happy Birthday!");
        } finally {
            printer.turnOff();
        }*/
        try {
            throw new MyException("");
        } catch (MyException e) {
            System.out.println("Hello from catch!");
           
        } finally {
            printer.turnOff();
        }
    }
}