# GuestBookV.2

# Requirements:
1.Install java 8

2.Install Maven 

## Environtment variable setup:

```shell
# Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url=jdbc:postgresql://localhost:5432/guestDBcrud
spring.datasource.username=postgres
spring.datasource.password=0

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto=update
```

## How to run

1. extract .jar and open with IntellIJ IDEA
2. Run project
3. open http://localhost:8080/home
