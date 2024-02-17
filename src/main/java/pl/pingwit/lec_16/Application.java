package pl.pingwit.lec_16;

import pl.pingwit.lec_16.task_1_email_annotation.EmailAnnotationValidator;
import pl.pingwit.lec_16.task_2_digit_annotation.DigitAnnotationValidator;
import pl.pingwit.lec_16.task_3_default_value_annotation.DefaultValueProcessor;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDetails customer = new CustomerDetails("Harry", "Potter", "harrypotter@gmail.com",
                "48797743626", LocalDate.of(2024, 1, 10), 1);
        EmailAnnotationValidator emailAnnotationValidator = new EmailAnnotationValidator();
        emailAnnotationValidator.validateEmail(customer);

        DigitAnnotationValidator digitAnnotationValidator = new DigitAnnotationValidator();
        digitAnnotationValidator.validatePhone(customer);

        CustomerDetails defaultCustomer = new CustomerDetails(null, null, null, null, null, null);
        DefaultValueProcessor defaultValueProcessor = new DefaultValueProcessor();
        defaultValueProcessor.process(defaultCustomer);
        System.out.println(defaultCustomer);
    }
}