# Spring Data JPA: Criteria API/Specification
Динамическое построение запросов с использованием JPA Criteria API/Specification
## Структура приложения
```
jpa-specifications
│
├─ org.example.jpaspec
│  │
│  ├─ controller
│  │  └─ ProductController.java
│  │
│  ├─ service
│  │  └─ ProductService.java
│  │
│  ├─ dto
│  │  ├─ ProductRepository.java
│  │  └─ ProductCategoryRepository.java
│  │      
│  ├─ entity
│  │  ├─ ProductRepository.java
│  │  └─ ProductCategoryRepository.java
│  │
│  ├─ repository
│  │  ├─ ProductRepository.java
│  │  └─ ProductCategoryRepository.java
│  │
│  ├─ specification
│  │  ├─ ProductSpecification.java
│  │  └─ SpecificationCollector.java
│  │
│  └─ JpaSpecificationsApplication.java
│
...
```
## Демонстрация
```
GET http://localhost:8080/products?name=ap&costTo=1000&costFrom=50&category=FRUITS
```
## Стек технологий
![Java](https://badgen.net/badge/Java/17+/orange)
![Java Spring Boot](https://badgen.net/badge/Spring%20Boot/3.4.7/green)
![Liquibase](https://badgen.net/badge/Liquibase/4.29.2/purple)
![Maven](https://badgen.net/badge/build/Maven)