package pl.pingwit.lec_16;

import pl.pingwit.lec_16.task_1_email_annotation.Email;
import pl.pingwit.lec_16.task_2_digit_annotation.OnlyDigit;
import pl.pingwit.lec_16.task_3_default_value_annotation.DefaultValue;

import java.time.LocalDate;

public class CustomerDetails {
    @DefaultValue
    private final String name;
    @DefaultValue
    private final String surname;
    @DefaultValue
    @Email
    private final String email;
    @DefaultValue
    @OnlyDigit
    private final String phone;
    @DefaultValue
    private final LocalDate registrationDate;
    @DefaultValue
    private final Integer priorityLevel;

    public CustomerDetails(String name, String surname, String email, String phone, LocalDate registrationDate, Integer priorityLevel) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.registrationDate = registrationDate;
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registrationDate=" + registrationDate +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
