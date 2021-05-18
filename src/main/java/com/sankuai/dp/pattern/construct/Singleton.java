package com.sankuai.dp.pattern.construct;

public class Singleton {

   private static final  Singleton singleton = new Singleton();

    private Singleton(){

    }

    public Singleton getInstence(){

        return singleton;
    }
}
