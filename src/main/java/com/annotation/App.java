package com.annotation;

/**
 * Created by mesut on 28.07.2016.
 */
public class App {

    public static void main(String[] args) throws Exception {
        AnnotationPrecessor<SampleClass> precessor = new AnnotationPrecessor<SampleClass>();
        precessor.PrecessorK(new SampleClass());

        AnnotationPrecessor ap = new AnnotationPrecessor();
        ap.PrecessorK(new SampleClass());
    }
}
