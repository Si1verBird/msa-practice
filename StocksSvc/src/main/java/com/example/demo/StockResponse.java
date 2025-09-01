package com.example.demo;

// 서버가 클라이언트에게 응답으로 주는 데이터 구조
public class StockResponse {

    private boolean drinkAvailability;

    // 기본 생성자
    public StockResponse() {}

    //생성자를 통해 응답 데이터를 초기화
    public StockResponse(boolean drinkAvailability) {
        this.drinkAvailability = drinkAvailability;
    }

    // Getter → JSON 응답으로 변환 시 필수
    public boolean isDrinkAvailability() {
        return drinkAvailability;
    }
    
    public void setDrinkAvailability(boolean drinkAvailability) {
        this.drinkAvailability = drinkAvailability;
    }
} 
