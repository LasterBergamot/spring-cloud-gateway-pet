package com.gateway.integergateway.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/integer")
public class IntegerGatewayRestController {

    @GetMapping("/number")
    public Integer randomIntegerNumber() {
        return ThreadLocalRandom.current().nextInt(0, 10 + 1);
    }
}
