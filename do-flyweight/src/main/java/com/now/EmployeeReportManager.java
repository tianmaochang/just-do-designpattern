package com.now;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/7
 */
public class EmployeeReportManager implements IReportManager {
    protected String tenantId = null;
    public EmployeeReportManager(String tenantId){
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is "+ tenantId +"'s employee report";
    }
}
