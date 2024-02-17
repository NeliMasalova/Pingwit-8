package pl.pingwit.lec_16.task_1_email_annotation;

public class EmailValidationException extends RuntimeException {
    public EmailValidationException(String message) {
        super(message);
    }
}