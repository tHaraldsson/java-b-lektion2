package se.tommy.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathConstantsTest {

    @Test
    void addTEN() {
        Assertions.assertEquals(15, MathConstants.addTEN(5));
    }
}