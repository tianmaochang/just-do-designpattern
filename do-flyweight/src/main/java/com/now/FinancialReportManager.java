package com.now;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/7
 */
public class FinancialReportManager implements IReportManager {
    protected String tenantId = null;
    public FinancialReportManager(String tenantId){
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is "+ tenantId +"'s financial report";
    }
}
