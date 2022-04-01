package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Customer customer = new Customer(1, "Maxine Mützerich", "Mützenhausen");
       
        customer.initOrder();
        Helper.ausgabe(customer.getOrder());
        customer.checkOrder();
        customer.removeOrder();
        Helper.ausgabe(customer.getOrder());
        customer.checkOrder();
    }

}

