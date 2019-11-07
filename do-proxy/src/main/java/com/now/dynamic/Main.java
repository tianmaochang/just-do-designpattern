package com.now.dynamic;

/**
 * @description：测试主类
 * @author TMAC
 * @version 1.00
 * @Date 2019/11/7
 */
public class Main {
    public static void main(String[] args) {
        IDBQuery proxy = new DBQueryProxy();
        String query = proxy.query();
        System.out.println(query);
    }
}
