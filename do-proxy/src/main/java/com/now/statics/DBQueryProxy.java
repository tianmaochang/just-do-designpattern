package com.now.statics;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/6
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
