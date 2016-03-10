package com.goit.gojavaonline.temperatureconversion;

public class TemperatureConversion {
    public static float fahrenheitToCelsius(float temperature) {
        return ((temperature - 32)*5)/9;
    }

    public static float celsiusToFahrenheit(float temperature) {
        return (temperature * 9)/5 + 32;
    }
}
