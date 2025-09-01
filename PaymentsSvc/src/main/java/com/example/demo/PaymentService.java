package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  // 스프링이 이 클래스를 서비스 계층으로 자동 등록
public class PaymentService {

    private final PaymentRepository repository;

    // Repository를 의존성 주입으로 받아서 사용
    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    // 결제 요청을 실제로 저장하고, 저장된 결과를 응답으로 반환
    @Transactional
    public PaymentResponse process(PaymentRequest request) {

        // 요청을 기반으로 PaymentEntity 생성 후 DB에 저장
        PaymentEntity saved = repository.save(
            new PaymentEntity(
                request.getOrderId(),
                request.getAmount(),
                request.getPaymentMethod(),
                "PENDING"  // 초기 상태는 항상 "PENDING"
            )
        );

        // 저장된 Entity의 ID 값을 이용해 응답 구성
        return new PaymentResponse("PAY-" + saved.getId(), saved.getStatus());
    }
}