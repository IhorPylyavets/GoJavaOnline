package com.goit.gojavaonline.temperatureconversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConversionTest {

    @Test(timeout = 3000)
    public void testFahrenheitToCelsius() throws Exception {
        float temperature = 100;

        final float result = TemperatureConversion.fahrenheitToCelsius(temperature);

        assertEquals(((temperature - 32)*5)/9, result, 0.0002);

    }

    @Test
    public void testCelsiusToFahrenheit() throws Exception {
        float temperature = 100;

        final float result = TemperatureConversion.celsiusToFahrenheit(temperature);

        assertEquals((temperature * 9)/5 + 32, result, 0.0002);
    }
}