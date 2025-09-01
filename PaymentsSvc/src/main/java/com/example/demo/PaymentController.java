package com.example.demo;

import org.springframework.web.bind.annotation.*;

// 이 컨트롤러는 REST API 요청을 처리하는 진입점 역할
@RestController
public class PaymentController {

    // PaymentService 의존성 주입 (스프링이 자동으로 연결해줌)
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // POST /payments 요청을 처리
    @PostMapping("/payments")
    public PaymentResponse createPayment(@RequestBody PaymentRequest request) {
        // 실제 동작은 서비스에 위임
        return paymentService.process(request);
    }
}