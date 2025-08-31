package com.example.demo;

import jakarta.persistence.*;

@Entity  // 이 클래스는 DB 테이블로 변환됨
@Table(name = "stocks")  // 테이블 이름 지정
public class StocksEntity {

    @Id  // 기본 키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID 자동 생성 (auto increment)
    private Long id;

    private String drinkId;
    private String orderSize;
    private boolean drinkAvailability;

    public StocksEntity() {}  // JPA용 기본 생성자

    // 실제 저장할 필드를 받는 생성자
    public StocksEntity(String drinkId, String orderSize, boolean drinkAvailability) {
        this.drinkId = drinkId;
        this.orderSize = orderSize;
        this.drinkAvailability = drinkAvailability;
    }

    // Getter 메서드들 - 객체 매핑용
    public Long getId() { return id; }
    public String getDrinkId() { return drinkId; }
    public String getOrderSize() { return orderSize; }
    public boolean isDrinkAvailability() { return drinkAvailability; }

    // Setter 메서드들
    public void setId(Long id) { this.id = id; }
    public void setDrinkId(String drinkId) { this.drinkId = drinkId; }
    public void setOrderSize(String orderSize) { this.orderSize = orderSize; }
    public void setDrinkAvailability(boolean drinkAvailability) { this.drinkAvailability = drinkAvailability; }
}