import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    @Test
    public void testThatCelciusToFahrenheitMethodGivesAccurateFahrenheitTemperature() {
        double celcius = 0;
        double expected = TemperatureConverter.celciusToFahrenheit(celcius);
        double actual = 32.0;
        assertEquals(actual, expected);

        celcius = 100;
        expected = TemperatureConverter.celciusToFahrenheit(celcius);
        actual = 212.0;
        assertEquals(actual, expected);

        celcius = -40;
        expected = TemperatureConverter.celciusToFahrenheit(celcius);
        actual = -40;
        assertEquals(actual, expected);
    }
}