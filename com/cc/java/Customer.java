package com.cc.java;

public class Customer {
   
    private int id; 
    private String name;
    private String city;

    private Order order;

    public Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /** Assoziation */
    public void initOrder() {
        // Referenz auf erzeugtes Objekt im Heap
        order = new Order(1, "repair");
    }

    public void removeOrder() {
        // Referenz wird mit null überschrieben
        // --> Objekt wird durch Garbage Collector 
        // aus dem Heap entfernt 
        order = null;
    }

    public void checkOrder() {
        if (order == null ) { // gibt es das Objekt ???
            Helper.ausgabe("Kein Auftrag vorhanden!");
        } else {
           Helper.ausgabe(getOrderDetails("#type")); 
           Helper.ausgabe(getOrderDetails("#?!4"));
        }
    }

    private String getOrderDetails(String flag) {
        
        switch (flag) {
            case "#type": // ordertype 
                return order.getOrderType();
               
            default:
                return "Irgendwas ging schief!";
              
        }
    }




     private String checkOrderStatus() {
        if (order.isFinished()) {
            return "Auftrag fertig." ;
        } else {
            return "Auftrag in Bearbeitung." ; 
        }
    }





    /** Getter */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Order getOrder() {
        return order;
    }

   

   
    

    

    
   
    
    






}
