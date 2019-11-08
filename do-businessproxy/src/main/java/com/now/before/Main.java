package com.now.before;

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
        try {
            IOrderManager orderManager = (IOrderManager) Naming.lookup("OrderManager");
            if(orderManager.checkUser(1)){
                Order order = orderManager.getOrder(1);
                order.setNumber(10);
                orderManager.updateOrder(order);
            }
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
