package com.xyz.base;

public class PageObject {

    protected void waitInSeconds(int second){
        try {
            Thread.sleep(second * 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
