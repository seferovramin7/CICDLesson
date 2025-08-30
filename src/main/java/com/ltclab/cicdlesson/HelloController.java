package com.ltclab.cicdlesson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloRoot() {
        return "Hellooooo, World!";
    }

    @GetMapping("/api/hello")
    public Map<String, String> helloApi() {
        return Map.of("message", "Hello from Spring Boot + Codespaces!");
    }
}
