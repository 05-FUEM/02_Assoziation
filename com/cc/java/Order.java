package com.cc.java;

public class Order {
    
    private int orderID;
    private String orderType;

    private boolean isFinished;

    public Order(int orderID, String orderType) {
        this.orderID = orderID;
        this.orderType = orderType;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getOrderType() {
        return orderType;
    }

    public boolean isFinished() {
        return isFinished;
    }

  
    



}
