package com.example.demo;

// 클라이언트가 보내는 음료제조가능여부 요청 정보를 담는 객체
public class StocksRequest {

    private String drinkId;
    private String orderSize;

    // 기본 생성자 (JSON → 객체 변환 시 필수)
    public StocksRequest() {}

    // Getter 및 Setter → JSON 매핑을 위해 필요

    public String getrDderId() {
        return orderId;
    }

    // Getter 및 Setter → JSON 매핑을 위해 필요
    public String getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(String drinkId) {
        this.drinkId = drinkId;
    }

    public String getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }
}