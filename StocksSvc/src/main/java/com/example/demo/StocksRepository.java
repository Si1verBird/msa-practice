package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA가 이 인터페이스를 기반으로 DB 저장 기능을 자동 생성해줌
public interface StocksRepository extends JpaRepository<StocksEntity, Long> {
}