package se.tommy.calculator;

public class TemperatureConverter {
    static final int thirtyTwo = 32;
    static final double femDelatPåNio = 5.0/9;
    static final double nioDelatpåFem = 9.0/5;



    static double toFahrenheit(double celsius) {
        return (celsius * nioDelatpåFem) + thirtyTwo;
    }
    static double toCelsius(double fahrenheit) {
        return (fahrenheit - thirtyTwo) * femDelatPåNio;
    }


}
