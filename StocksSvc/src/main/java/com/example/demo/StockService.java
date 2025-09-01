package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service  // 스프링이 이 클래스를 서비스 계층으로 자동 등록
public class StockService {

    private final StockRepository repository;

    // Repository를 의존성 주입으로 받아서 사용
    public StockService(StockRepository repository) {
        this.repository = repository;
    }

    // 음료 가용성 조회
    @Transactional(readOnly = true)
    public StockResponse checkDrinkAvailability(StockRequest request) {
        Optional<Boolean> availability = repository.findDrinkAvailabilityByDrinkIdAndOrderSize(
            request.getDrinkId(), 
            request.getOrderSize()
        );
        
        boolean drinkAvailability = availability.orElse(false); // 없으면 false 반환
        return new StockResponse(drinkAvailability);
    }

    // 음료 가용성 upsert (있으면 업데이트, 없으면 생성)
    @Transactional
    public StockResponse upsertDrinkAvailability(StockRequest request, boolean drinkAvailability) {
        Optional<StockEntity> existingStock = repository.findByDrinkIdAndOrderSize(
            request.getDrinkId(), 
            request.getOrderSize()
        );
        
        if (existingStock.isPresent()) {
            // 기존 데이터 업데이트
            StockEntity stock = existingStock.get();
            stock.setDrinkAvailability(drinkAvailability);
            repository.save(stock);
        } else {
            // 새 데이터 생성
            StockEntity newStock = new StockEntity(
                request.getDrinkId(), 
                request.getOrderSize(), 
                drinkAvailability
            );
            repository.save(newStock);
        }
        
        return new StockResponse(drinkAvailability);
    }
}