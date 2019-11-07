package com.now.dynamic;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/6
 */
public class DBQuery implements IDBQuery {
    public DBQuery(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String query() {
        return "query string";
    }
}
