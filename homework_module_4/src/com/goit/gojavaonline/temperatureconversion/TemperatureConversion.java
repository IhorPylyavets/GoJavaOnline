package com.goit.gojavaonline.temperatureconversion;

public class TemperatureConversion {
    public float fahrenheitToCelsius(float temperature) {
        return ((temperature - 32)*5)/9;
    }

    public float celsiusToFahrenheit(float temperature) {
        return (temperature * 9)/5 + 32;
    }
}
