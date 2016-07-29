package com.annotation;

import java.lang.reflect.Method;

/**
 * Created by mesut on 29.07.2016.
 */
public class AnnotationPrecessor {

    public static void Precessor(Class cls) throws Exception {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TimeKeeper.class)) {
                method.invoke(null);
            }
        }
    }
}
