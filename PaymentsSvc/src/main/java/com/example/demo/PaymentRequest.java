package com.example.demo;

// 클라이언트가 보내는 결제 요청 정보를 담는 객체
public class PaymentRequest {

    private String orderId;
    private int amount;
    private String paymentMethod;

    // 기본 생성자 (JSON → 객체 변환 시 필수)
    public PaymentRequest() {}

    // Getter 및 Setter → JSON 매핑을 위해 필요

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}