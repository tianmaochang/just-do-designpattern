package com.now.after;

import com.now.IOrderManager;
import com.now.Order;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Desc 业务代理对象
 * @Author TMAC
 * @Date 2019/11/8
 * @Version 1.00
 */
public class BusinessDelegate {
    IOrderManager orderManager = null;

    public BusinessDelegate(){
        try {
            IOrderManager orderManager = (IOrderManager) Naming.lookup("OrderManager");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public boolean checkUserFromCache(int id){
        return true;
    }

    public boolean checkUser(int id){
        if(!checkUserFromCache(id)){
            return orderManager.checkUser(1);
        }
        return true;
    }

    public Order getOrderFromCache(int oid){
        return null;
    }

    public Order getOrder(int oid){
        Order order = getOrderFromCache(oid);
        if (order == null) {
            return orderManager.getOrder(oid);
        }
        return order;
    }

    public boolean updateOrder(Order order){
        if(checkUser(1)){
            Order o = getOrder(1);
            o.setNumber(10);
            orderManager.updateOrder(order);
        }
        return true;
    }
}
