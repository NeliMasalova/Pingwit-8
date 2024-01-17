package pl.pingwit.lec_10.Task_1_User;

import java.util.regex.Pattern;

public class UserInfoValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^(?=. {1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");
    private static final Pattern NAME_PATTERN = Pattern.compile("[a-zA-zа-яА-Я]*");
    private static final Pattern TELEPHONE_PATTERN = Pattern.compile("\\d*");

    public boolean validateUserInfo(UserInfo userInfo) {
        boolean isValid = true;
        if (userInfo.userName().isBlank()) {
            System.out.println("Username cannot be empty!");
            isValid = false;
        }

        if (!userInfo.name().matches("[a-zA-Z]+") || !userInfo.surname().matches("[a-zA-Z]+")) {
            System.out.println("Your name and surname can contain only letters: ");
            isValid = false;
        }

        if (!userInfo.email().matches("^(?=. {1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$")) {
            System.out.println("Invalid email address.");
            isValid = false;
        }

        if (!userInfo.telephone().matches("\\d*")){
            System.out.println("Phone number can contain only digits");
            isValid = false;
        }
        if(userInfo.password().isBlank()){
            System.out.println("Password cannot be empty!");
            isValid = false;
        }
        return isValid;
    }
}