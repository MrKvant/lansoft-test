# lansoft-test
Тестовое задание для компании "Lansoft"

### Условие
+ При помощи spring boot создать микросервис для двух сущностей ( Entity ) 
+ Entity 1 - Customer
(id, name, age, company_id)
+ Каждый customer может иметь одну компанию
+ Entity 2 - Company
(id, company_name)  (много юзеров, связь один ко многим )
 
+ Реализовать REST сервис с набором методов (CRUD операций для компании и для юзера)
+ при вводе customer controller - реализовать поиск по имени и по компании
+ Для упрощения можно использовать базу данных h2

### Используемые технологии:
```Java``` ```Spring Boot``` ```Spring Data JPA``` ```Hibernate``` ```MySQL```

### БД
![alt text](screenshot_database.png "Описание")
