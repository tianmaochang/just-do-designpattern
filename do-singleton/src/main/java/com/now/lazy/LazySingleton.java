package com.now.lazy;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/5
 */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("LazySingleton is create");
    }

    private static LazySingleton instance = null;
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
