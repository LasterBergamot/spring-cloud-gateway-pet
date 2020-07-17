package com.gateway.doublegateway.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/double")
public class DoubleGatewayRestController {

    @GetMapping("/number")
    public Double randomDoubleNumber() {
        return ThreadLocalRandom.current().nextDouble(1.0, 10.0 + 1);
    }
}
