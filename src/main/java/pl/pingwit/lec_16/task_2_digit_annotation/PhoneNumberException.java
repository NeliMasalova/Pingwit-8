package pl.pingwit.lec_16.task_2_digit_annotation;

public class PhoneNumberException extends RuntimeException {
    public String phone;
    public String message;

    public PhoneNumberException(String message, String phone) {
        super(message + ":" + phone);
        this.message = message;
        this.phone = phone;
    }

//    @Override
//    public String toString() {
//        return "PhoneNumberException{" +
//                "phone='" + phone + '\'' +
//                ", message='" + message + '\'' +
//                '}';
//    }
}