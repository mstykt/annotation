package com.annotation2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by mesut on 29.07.2016.
 */
public class AnnotationOperations<T> {

    public void operations(T t) {
        for (Method method : t.getClass().getDeclaredMethods()) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Book) {
                    System.out.println("name: " + ((Book) annotation).name());
                    System.out.println("author: " + ((Book) annotation).author());
                    System.out.println("currentRevision: " + ((Book) annotation).currentRevision());
                }
            }
        }
    }
}
