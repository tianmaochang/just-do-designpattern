package com.now;

import java.util.HashMap;
import java.util.Map;

/**
 * @description：享元工厂类
 * @author TMAC
 * @version 1.00
 * @Date 2019/11/7
 */
public class ReportManagerFactory {
    Map<String,IReportManager> financialManager = new HashMap();
    Map<String,IReportManager> employeeManager = new HashMap();

    IReportManager getFinancialReportManager(String tenantId){
        IReportManager reportManager = financialManager.get(tenantId);
        if (reportManager == null) {
            reportManager = new FinancialReportManager(tenantId);
            financialManager.put(tenantId,reportManager);
        }
        return reportManager;
    }

    IReportManager getEmployeeReportManager(String tenantId){
        IReportManager reportManager = employeeManager.get(tenantId);
        if (reportManager == null) {
            reportManager = new EmployeeReportManager(tenantId);
            employeeManager.put(tenantId,reportManager);
        }
        return reportManager;
    }
}
