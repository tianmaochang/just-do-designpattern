package com.now.dynamic;

/**
 * @description：代理类
 * @author TMAC
 * @version 1.00
 * @Date 2019/11/7
 */
public class DBQueryProxy implements IDBQuery {
    private DBQuery idbQuery = null;

    @Override
    public String query() {
        if (idbQuery == null) {
            idbQuery = new DBQuery();
        }
        return idbQuery.query();
    }
}
