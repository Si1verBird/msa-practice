package com.example.demo;
// Spring Web의 REST API 기능을 사용하기 위한 패키지 임포트
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired; // 추가
import com.example.demo.StockDto;
import com.example.demo.StockService;

@RestController
public class StockController {
    
    @Autowired // 추가: 의존성 주입
    private StockService stockService; // 추가: 필드 선언
    
    @GetMapping("/stocks")
    public StockResponse getStocks(
        @RequestParam String drinkID,
        @RequestParam String orderSize
    ){
        // drinkID와 orderSize에 따라 drinkAvailability 결정
        StockRequest request = new StockRequest();
        request.setDrinkId(drinkID);
        request.setOrderSize(orderSize);
        return stockService.checkDrinkAvailability(request);
    }
}