package com.example.demo.Controller;

// Spring Web의 REST API 기능을 사용하기 위한 패키지 임포트
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // 이 클래스가 REST API의 컨트롤러임을 명시
public class PaymentController {

    // HTTP POST 요청 중 "/payments" 경로로 들어온 요청을 처리함
    @PostMapping("/payments")
    public Map<String, Object> createPayment(
        // 요청 본문(JSON)을 Java 객체(Map)로 자동 변환해서 매핑함
        @RequestBody Map<String, Object> request
    ) {
        // 요청은 실제로 처리하지 않고, 고정된 응답을 반환함
        // → "작동하는 계약 API를 만들었다"는 실험에 집중

        return Map.of(
            "paymentId", "PAY5678",  // 고정된 결제 ID 반환
            "status", "PENDING"      // 결제 상태는 항상 "PENDING"
        );
    }
}