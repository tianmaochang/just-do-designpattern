package com.now.dynamic;

/**
 * @description：真是主题类
 * @author TMAC
 * @version 1.00
 * @Date 2019/11/7
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
