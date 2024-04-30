package com.example.calculator.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/op")
public class CalculatorController {

    @Operation(summary = "Realiza a adição de dois números inteiros")
    @RequestMapping(value = "/add/{a}/{b}", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Double> adicao(@PathVariable int a, @PathVariable int b) {
        double res = a + b;
        return ResponseEntity.ok(res);
    }

    @Operation(summary = "Realiza a subtração de dois números inteiros")
    @RequestMapping(value = "/sub/{a}/{b}", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Double> subtracao(@PathVariable int a, @PathVariable int b) {
        double res = a - b;
        return ResponseEntity.ok(res);
    }

    @Operation(summary = "Realiza a multiplicação de dois números inteiros")
    @RequestMapping(value = "/mult/{a}/{b}", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Double> multiplicacao(@PathVariable int a, @PathVariable int b) {
        double res = a * b;
        return ResponseEntity.ok(res);
    }

    @Operation(summary = "Realiza a divisao de dois números inteiros")
    @RequestMapping(value = "/div/{a}/{b}", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Double> divisao(@PathVariable double a, @PathVariable int b) {
        if (b == 0) {
            return ResponseEntity.badRequest().body(null);
        }
        double res = a / b;
        return ResponseEntity.ok(res);
    }

    @Operation(summary = "Realiza a exponenciação de dois números inteiros")
    @RequestMapping(value = "/exp/{a}/{b}", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Double> exponenciacao(@PathVariable int a, @PathVariable int b) {
        double res = Math.pow(a, b);
        return ResponseEntity.ok(res);
    }
}
