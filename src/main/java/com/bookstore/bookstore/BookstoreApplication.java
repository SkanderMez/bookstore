package com.bookstore.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bookstore.bookstore.controller")
public class BookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run (BookstoreApplication.class, args);
    }

}
