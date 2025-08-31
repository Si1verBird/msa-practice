package com.example.demo;

// 서버가 클라이언트에게 응답으로 주는 데이터 구조
public class PaymentResponse {

    private String paymentId;
    private String status;

    //생성자를 통해 응답 데이터를 초기화
    public PaymentResponse(String paymentId, String status) {
        this.paymentId = paymentId;
        this.status = status;
    }

    // Getter → JSON 응답으로 변환 시 필수
    public String getPaymentId() {
        return paymentId;
    }

    public String getStatus() {
        return status;
    }
} 
