package com.annotation;

/**
 * Created by mesut on 28.07.2016.
 */
public class App {

    public static void main(String[] args) throws Exception {
        AnnotationPrecessor<SampleClass> precessor = new AnnotationPrecessor<SampleClass>();
        SampleClass sampleClass = new SampleClass();
        precessor.PrecessorK(new SampleClass());
    }
}
