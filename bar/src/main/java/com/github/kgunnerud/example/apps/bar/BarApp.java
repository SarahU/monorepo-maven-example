package com.github.kgunnerud.example.apps.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.TreeBidiMap;


@RestController
@RequestMapping
@SpringBootApplication
public class BarApp {
    public static void main(String[] args) {
        SpringApplication.run(BarApp.class, args);
    }

    @GetMapping("bar")
    String bar() {
        BidiMap bidi = new TreeBidiMap();
        return "world";
    }

    @GetMapping("fooByProxy")
    String foo() {
        return "hello";
    }
}
