package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by mesut on 29.07.2016.
 */
public class AnnotationPrecessor<T> {

    public void PrecessorK(T cls) throws Exception {
        System.out.println(cls.getClass().getSimpleName());
        for (Method method : cls.getClass().getDeclaredMethods()) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(TimeKeeper.class)) {
                    method.setAccessible(true);
                    method.invoke(cls);
                }
            }

        }
    }
}
