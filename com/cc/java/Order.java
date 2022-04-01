package com.cc.java;

import java.time.LocalDate;

public class Order {
    
    private int orderID;
    private String orderType;

    private LocalDate orderDate;
    private boolean isFinished;

    public Order(int orderID, String orderType) {
        // Werte von aussen
        this.orderID = orderID;
        this.orderType = orderType;
        // Werte von innen / Actions ...
        this.orderDate = LocalDate.now();

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

    public LocalDate getOrderDate() {
        return orderDate;
    }

  
    



}
