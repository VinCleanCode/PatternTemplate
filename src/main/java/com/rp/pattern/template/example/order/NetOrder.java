package com.rp.pattern.template.example.order;

public class NetOrder extends OrderProcessTemplate{
    public void  doSelect(){
        System.out.println("Item added to online shopping cart");
    }

    public void doPayment(){
        System.out.println("Item added to online shopping cart");
    }

    public void doDelivery() {
        System.out.println();
    }
}
