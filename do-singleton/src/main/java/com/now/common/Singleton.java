package com.now.common;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/5
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is create");
    }

    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }

    public static void createString(){
        System.out.println("createString in String");
    }
}
