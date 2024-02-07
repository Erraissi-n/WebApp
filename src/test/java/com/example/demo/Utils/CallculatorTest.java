package com.example.demo.Utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CallculatorTest {
    @Test
    public void testAdd(){
        Callculator calculator = new Callculator();
        Assertions.assertEquals(6, calculator.add(4, 2));
    }
}
