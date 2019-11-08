package com.now.after;

import com.now.IOrderManager;
import com.now.Order;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Desc 未使用业务代理模式前
 * @Author TMAC
 * @Date 2019/11/8
 * @Version 1.00
 */
public class Main {
    public static void main(String[] args) {
       BusinessDelegate delegate = new BusinessDelegate();
       Order order = delegate.getOrder(11);
       order.setNumber(11);
       delegate.updateOrder(order);
    }
}
