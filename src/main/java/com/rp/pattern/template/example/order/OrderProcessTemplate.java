package com.rp.pattern.template.example.order;

abstract class OrderProcessTemplate {
    public  boolean isGift;

    public abstract  void doSelect();

    public abstract void doPayment();

    public  final void giftWrap(){
        try{
            System.out.println("Gift wrap successful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public abstract void doDelivery();

    public final void processOrder(boolean isGift){
        doSelect();
        doPayment();
        if(isGift){
            giftWrap();
        }
        doDelivery();
    }
}
