package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

// JPA가 이 인터페이스를 기반으로 DB 저장 기능을 자동 생성해줌
public interface StockRepository extends JpaRepository<StockEntity, Long> {
    
    // 음료 ID와 사이즈로 가용성 조회 (Boolean 값만 반환)
    @Query("SELECT s.drinkAvailability FROM StockEntity s WHERE s.drinkId = :drinkId AND s.orderSize = :orderSize")
    Optional<Boolean> findDrinkAvailabilityByDrinkIdAndOrderSize(@Param("drinkId") String drinkId, @Param("orderSize") String orderSize);
    
    // 음료 ID와 사이즈로 전체 엔티티 조회
    Optional<StockEntity> findByDrinkIdAndOrderSize(String drinkId, String orderSize);
}