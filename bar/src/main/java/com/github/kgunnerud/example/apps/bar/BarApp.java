package com.github.kgunnerud.example.apps.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequestMapping
@SpringBootApplication
public class BarApp {
    public static void main(String[] args) {
        SpringApplication.run(BarApp.class, args);
    }

    @GetMapping("bar")
    String bar() {
        return "world";
    }

    @GetMapping("fooByProxy")
    String foo() {
        var restTemplate = new RestTemplate(); // Yes, should be a bean.
        return "hello";
    }
}
