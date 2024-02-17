package pl.pingwit.lec_16.task_1_email_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$");

    public void validateEmail(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredFields : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredFields.getAnnotations()) {
                if (annotation.annotationType().equals(Email.class) && declaredFields.getType().equals(String.class)) {
                    declaredFields.setAccessible(true);
                    if (!EMAIL_PATTERN.matcher((String) declaredFields.get(obj)).matches()) {
                        throw new EmailValidationException("Invalid email address.");
                    }
                }
            }
        }
    }
}