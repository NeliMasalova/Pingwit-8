package pl.pingwit.lec_16.task_3_default_value_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class DefaultValueProcessor {
    public void process(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredFields : clazz.getDeclaredFields()) {
            declaredFields.setAccessible(true);
            for (Annotation annotation : declaredFields.getAnnotations()) {
                if (declaredFields.get(obj) == null && annotation.annotationType().equals(DefaultValue.class)) {
                    if (declaredFields.getType().equals(String.class)) {
                        declaredFields.set(obj, "defaultValue");
                    }
                    if (declaredFields.getType().equals(LocalDate.class)) {
                        declaredFields.set(obj, LocalDate.now());
                    }
                    if (declaredFields.getType().equals(Integer.class)) {
                        declaredFields.set(obj, 0);
                    }
                }
            }
        }
    }
}