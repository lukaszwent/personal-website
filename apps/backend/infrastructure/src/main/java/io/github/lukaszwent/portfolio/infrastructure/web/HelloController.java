package io.github.lukaszwent.portfolio.infrastructure.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    @GetMapping("/api/hello")
    String hello() {
        return "Hello";
    }
}
