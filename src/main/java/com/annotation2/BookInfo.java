package com.annotation2;

/**
 * Created by mesut on 29.07.2016.
 */
public class BookInfo {

    @Book(name = "bookname 1", author = "author 1")
    public void  bInfo1(){
        System.out.println("bInfo1 method");
    }

    @Book(name = "bookname2", author = "author 2", currentRevision = 3)
    public void bInfo2() {
        System.out.println("bInfo2 method");
    }
}
