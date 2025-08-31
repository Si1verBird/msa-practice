# Spring Boot Demo Project

## 프로젝트 개요
Spring Boot 3.5.5를 사용한 데모 프로젝트입니다.

## 기술 스택
- **Java**: 17
- **Spring Boot**: 3.5.5
- **Build Tool**: Gradle
- **Packaging**: Jar

## 프로젝트 정보
- **Group**: com.example
- **Artifact**: demo
- **Name**: demo
- **Description**: Demo project for Spring Boot
- **Package**: com.example.demo

## 포함된 의존성

### 핵심 의존성
- **Spring Web**: 웹 애플리케이션 개발용
- **Spring Data JPA**: 데이터베이스 연동용
- **Spring Boot Actuator**: 운영 상태 모니터링용

### 데이터베이스
- **H2 Database**: 메모리 기반 테스트 DB
- **MySQL Driver**: 실제 DB 연동 시 사용

### 개발 도구
- **Lombok**: 코드 간결화용 어노테이션 지원

## 프로젝트 구조
```
demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/demo/
│               └── DemoApplicationTests.java
├── build.gradle
├── settings.gradle
└── gradlew
```

## 실행 방법

### 1. 프로젝트 빌드
```bash
./gradlew build
```

### 2. 애플리케이션 실행
```bash
./gradlew bootRun
```

### 3. 테스트 실행
```bash
./gradlew test
```

## 접속 정보
- **기본 URL**: http://localhost:8080
- **Actuator**: http://localhost:8080/actuator

## 개발 환경 설정
- Java 17 이상 필요
- IDE: IntelliJ IDEA, Eclipse, VS Code 등

## 주의사항
- 현재는 기본 구조만 생성된 상태
- Controller, Service, Repository 등 계층 구조는 추후 추가 예정
- H2 Database는 메모리 기반으로 동작 (애플리케이션 재시작 시 데이터 초기화)
