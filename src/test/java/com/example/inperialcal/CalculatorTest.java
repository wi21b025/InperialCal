package com.example.inperialcal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator test = new Calculator();

    @Test
    void cmTest(){
        double a = 5;
        double expected = 12.7;

        double result = test.cm(a);

        assertEquals(expected,result);
    }

    @Test
    void mTest(){
        double a = 2;
        double expected = 1.8288;

        double result = test.m(a);

        assertEquals(expected,result);
    }
}

