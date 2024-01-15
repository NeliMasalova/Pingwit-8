package pl.pingwit.lec_10.Task_1_User;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter username");
        String userName = scanner.nextLine();
        System.out.println("Please, enter  your name");
        String name = scanner.nextLine();
        System.out.println("Please, enter your surname");
        String surname = scanner.nextLine();
        System.out.println("Please, enter your email");
        String email = scanner.nextLine();
        System.out.println("Please, enter your phone number");
        String telephone = scanner.nextLine();
        System.out.println("Please, enter your password");
        String password = scanner.nextLine();

        UserInfo userInfo = new UserInfo(userName, name, surname, email, telephone, password);
        boolean b = UserInfoValidator.validateUserInfo(userInfo);
        System.out.println(b);
    }
}
