package com.example.demo;

import com.example.adaptor.Adaptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        final var adaptor = new Adaptor();

        System.out.println(adaptor.canAccess());

        SpringApplication.run(DemoApplication.class, args);
    }
}
