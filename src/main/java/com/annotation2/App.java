package com.annotation2;

/**
 * Created by mesut on 29.07.2016.
 */
public class App {
    public static void main(String[] args) {
        AnnotationOperations<BookInfo> operations = new AnnotationOperations<BookInfo>();
        operations.operations(new BookInfo());
    }
}
