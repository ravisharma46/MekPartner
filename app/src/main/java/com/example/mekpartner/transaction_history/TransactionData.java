package com.example.mekpartner.transaction_history;

public class TransactionData {

    private String orderId, orderDate, amount, debitedFrom;
    private int img;

    public TransactionData(String orderId, String orderDate, String amount, String debitedFrom, int img) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.amount = amount;
        this.debitedFrom = debitedFrom;
        this.img = img;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDebitedFrom() {
        return debitedFrom;
    }

    public void setDebitedFrom(String debitedFrom) {
        this.debitedFrom = debitedFrom;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
