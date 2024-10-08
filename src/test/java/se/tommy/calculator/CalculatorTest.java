package se.tommy.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Assertions.assertEquals(6, Calculator.multiply(2, 3));
    }
}