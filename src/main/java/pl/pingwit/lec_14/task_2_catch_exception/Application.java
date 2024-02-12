package pl.pingwit.lec_14.task_2_catch_exception;

public class Application {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 21, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            try {
                int result = 100 / (numbers[i] - 9);
                System.out.println("Result for element #" + i + ": " + result);
            } catch (ArithmeticException e) {
                System.out.println("При обработке элемента " + i + " возникла ошибка:" + e.getMessage());
            }
        }
    }
}