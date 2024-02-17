package pl.pingwit.lec_14.task_5_my_exception;

public class MyException extends RuntimeException {
    public MyException(String message){
        super(message);
    }
}