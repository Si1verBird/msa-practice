# MSA 실습 프로젝트

이 프로젝트는 MSA(Microservice Architecture) 실습을 위한 프로젝트입니다.

## 프로젝트 구조

- `PaymentsSvc/`: 결제 서비스 마이크로서비스
- `StocksSvc/`: 주식 서비스 마이크로서비스
- `demo/`: 데모 프로젝트

## 기술 스택

- Java
- Spring Boot
- Gradle
- Git

## 실행 방법

각 서비스 디렉토리에서 다음 명령어를 실행하세요:

```bash
./gradlew bootRun
```

## API 테스트

각 서비스의 `testHttp/` 디렉토리에 HTTP 테스트 파일이 포함되어 있습니다.
