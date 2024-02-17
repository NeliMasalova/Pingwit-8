package pl.pingwit.lec_16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$");

    public void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredFields : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredFields.getAnnotations()) {
                if (annotation.annotationType().equals(Email.class) && declaredFields.getType().equals(String.class)) {
                    declaredFields.setAccessible(true);
                    String o = (String) declaredFields.get(obj);
                    if (!EMAIL_PATTERN.matcher(o).matches()) {
                        String message = "Invalid email address."; // давай сообщение сразу в конструктор исключения. Не вижу смысла делать отдельной переменной
                        throw new EmailValidationException(message);
                    }
                }
            }
        }
    }
}
