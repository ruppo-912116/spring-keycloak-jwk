package com.test.keycloak.jwk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/api/test")
    public String hello() {
        return "Hello World!";
    }
}
