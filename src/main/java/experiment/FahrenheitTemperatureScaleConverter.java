package experiment;

/**
 * Fahrenheit Temperature Scale Converter.
 *
 * Concrete converter implementations for Fahrenheit scale.
 */
class FahrenheitTemperatureScaleConverter extends AbstractTemperatureScaleConverter
{

    @Override
    public Temperature createTemperature(float degrees)
    {
        return Temperature.fromFahrenheit(degrees);
    }

    @Override
    public float convertTemperature(Temperature temp)
    {
        return temp.toDegreesFahrenheit();
    }
}
