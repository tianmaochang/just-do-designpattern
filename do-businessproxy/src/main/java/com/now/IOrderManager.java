package com.now;

import java.rmi.Remote;

/**
 * @Desc
 * @Author TMAC
 * @Date 2019/11/8
 * @Version 1.00
 */
public interface IOrderManager extends Remote {
    boolean checkUser(int id);
    Order getOrder(int id);
    int updateOrder(Order order);
}
