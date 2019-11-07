package com.now.statics;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/6
 */
public class Main {
    public static void main(String[] args) {
        IDBQuery proxy = new DBQueryProxy();
        String query = proxy.query();
        System.out.println(query);
    }
}
