package com.example.demo;

import jakarta.persistence.*;

@Entity  // 이 클래스는 DB 테이블로 변환됨
public class PaymentEntity {

    @Id  // 기본 키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID 자동 생성 (auto increment)
    private Long id;

    private String orderId;
    private int amount;
    private String paymentMethod;
    private String status;

    public PaymentEntity() {}  // JPA용 기본 생성자

    // 실제 저장할 필드를 받는 생성자
    public PaymentEntity(String orderId, int amount, String paymentMethod, String status) {
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    // Getter 메서드들 - 객체 매핑용
    public Long getId() { return id; }
    public String getOrderId() { return orderId; }
    public int getAmount() { return amount; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getStatus() { return status; }
}