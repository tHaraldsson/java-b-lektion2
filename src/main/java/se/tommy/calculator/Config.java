package se.tommy.calculator;

public class Config {
    static final String appName = "Calculator";
    static final double appVersion = 1.5;
    static final int maxUsers = 6;

    static void printConfig() {
        System.out.println("Applikationsnamnet: " + appName + "Version: " + appVersion + "Max Användare: " + maxUsers);
    }
}
