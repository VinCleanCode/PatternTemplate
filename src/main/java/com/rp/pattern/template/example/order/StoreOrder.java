package com.rp.pattern.template.example.order;

public class StoreOrder extends OrderProcessTemplate {
    public void doSelect() {
        System.out.println("Customer choose the item for shelf");
    }

    public void doPayment() {
        System.out.println("Pays at counter through cash/POS");
    }

    public void doDelivery() {
        System.out.println("Item deliverd to in deliver counter.");
    }
}
