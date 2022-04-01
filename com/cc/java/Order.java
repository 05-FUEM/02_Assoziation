package com.cc.java;

import java.time.LocalDate;
import java.util.Timer;

public class Order {
    
    private int orderID;
    private String orderType;

    private LocalDate orderDate;
    private boolean isFinished;
    private Timer timer;

    public Order(int orderID, String orderType) {
        // Werte von aussen
        this.orderID = orderID;
        this.orderType = orderType;
        // Werte von innen / Actions ...
        this.orderDate = LocalDate.now();
        startTimer();
    }

    /** Auftragshandling */

    private void startTimer() {
       Helper.ausgabe("Timer gestartet"); 
    }



    /** Getter */
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
