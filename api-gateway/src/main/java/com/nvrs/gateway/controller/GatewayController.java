package com.nvrs.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {
    @GetMapping(path = "/")
    public ResponseEntity<Void> defaultSuccess() {
        return new ResponseEntity<Void>(
                HttpStatus.OK
        );
    }
}
