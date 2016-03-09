package com.goit.gojavaonline.temperatureconversion;

public class Main {
    public static void main(String[] args) {
        TemperatureConversion conversion = new TemperatureConversion();

        System.out.println("fahrenheitToCelsius: " + conversion.fahrenheitToCelsius(100));

        System.out.println("celsiusToFahrenheit: " + conversion.celsiusToFahrenheit(100));
    }
}

