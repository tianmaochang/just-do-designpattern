package com.now;

import java.io.Serializable;

/**
 * @Desc
 * @Author TMAC
 * @Date 2019/11/8
 * @Version 1.00
 */
public class Order implements Serializable{
    private int orderId;
    private String clientName;
    private int number;
    private String productName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
