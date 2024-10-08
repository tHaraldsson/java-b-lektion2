package se.tommy.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {



    @Test
    void testArea() {
        Assertions.assertEquals(314.1592653589793, Circle.area(10));
    }
}