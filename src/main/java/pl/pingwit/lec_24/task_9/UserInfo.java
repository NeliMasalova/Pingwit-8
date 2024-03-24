package pl.pingwit.lec_24.task_9;

import java.time.LocalDate;

public record UserInfo(
        String name,
        String surname,
        String phone,
        String mail,
        LocalDate birthdate) {
}
