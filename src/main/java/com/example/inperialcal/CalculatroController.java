package com.example.inperialcal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CalculatroController {
    Calculator e = new Calculator();
    @RequestMapping("/cm")
    public double cm(@RequestParam double a) {
        return e.cm(a);
    }
}

