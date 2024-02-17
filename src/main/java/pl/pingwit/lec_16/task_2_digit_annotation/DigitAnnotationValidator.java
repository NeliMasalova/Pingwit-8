package pl.pingwit.lec_16.task_2_digit_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class DigitAnnotationValidator {
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("\\d+");

    public void validatePhone(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredFields : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredFields.getAnnotations()) {
                if (declaredFields.getType().equals(String.class) && annotation.annotationType().equals(OnlyDigit.class)) {
                    declaredFields.setAccessible(true);
                    if (!PHONE_NUMBER_PATTERN.matcher((String) declaredFields.get(obj)).matches()) {
                        throw new PhoneNumberException("Invalid phone number.");
                    }
                }
            }
        }
    }
}