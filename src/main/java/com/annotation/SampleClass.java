package com.annotation;

/**
 * Created by mesut on 29.07.2016.
 */
public class SampleClass {

    @TimeKeeper
    public void mtd1() {
        System.out.println("Hello from mtd1");
    }

    public static void mtd2() {
        System.out.println("Hello from mtd2");
    }

    @TimeKeeper
    public void mtd3() {
        System.out.println("Hello from mtd3");
    }
}
