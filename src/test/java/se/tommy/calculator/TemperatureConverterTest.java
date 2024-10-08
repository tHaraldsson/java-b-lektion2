package se.tommy.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void toFahrenheit() {
        Assertions.assertEquals(89.6, TemperatureConverter.toFahrenheit(32));
    }

    @Test
    void toCelsius() {
        Assertions.assertEquals(0, TemperatureConverter.toCelsius(32));
    }
}