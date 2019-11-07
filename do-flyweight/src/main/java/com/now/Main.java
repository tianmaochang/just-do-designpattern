package com.now;

/**
 * @author TMAC
 * @version 1.00
 * @description：
 * @Date 2019/11/7
 */
public class Main {
    public static void main(String[] args) {
        ReportManagerFactory factory = new ReportManagerFactory();
        IReportManager employeeManager = factory.getEmployeeReportManager("B");
        System.out.println(employeeManager.createReport());
        IReportManager financialManager = factory.getFinancialReportManager("C");
        System.out.println(financialManager.createReport());
    }
}
