package pl.pingwit.lec_16.task_1_email_annotation;

public class EmailValidationException extends RuntimeException {
    private String email;

    public EmailValidationException(String message, String email) {
        super(message);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmailValidationException{" +
                "email='" + email + '\'' +
                '}';
    }
}