package com.husaria.toolkit;

/**
 * Created by Owner on 8/19/2018.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton()
    {

    }

    public static Singleton getInstance() {
        return instance;
    }


}
