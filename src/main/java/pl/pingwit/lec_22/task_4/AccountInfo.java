package pl.pingwit.lec_22.task_4;

import java.time.LocalDate;

public record AccountInfo(String name, String surname, String phone, String mail,
                          LocalDate birthdate) implements Comparable<AccountInfo> {
    @Override
    public int compareTo(AccountInfo o) {
        int nameResult = this.name().compareTo(o.name());
        if (nameResult != 0) {
            return -nameResult ;
        }

        int surnameResult = this.surname().compareTo(o.surname());
        if (surnameResult != 0) {
            return surnameResult;
        }

        int phoneResult = this.phone().compareTo(o.phone());
        if (phoneResult != 0) {
            return phoneResult;
        }

        int mailResult = this.mail().compareTo(o.mail());
        if (mailResult != 0) {
            return mailResult;
        }

        return this.birthdate().compareTo(o.birthdate());
    }
}