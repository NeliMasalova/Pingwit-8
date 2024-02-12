package pl.pingwit.lec_16;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDetails customer = new CustomerDetails("Harry", "Potter", "harrypotter@gmail.com",
                "+4879774626", LocalDate.of(2024, 1, 10), 1);
        EmailAnnotationValidator emailAnnotationValidator = new EmailAnnotationValidator();
        emailAnnotationValidator.validate(customer);
    }
}