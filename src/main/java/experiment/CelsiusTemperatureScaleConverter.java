package experiment;

/**
 * Celsius Temperature Scale Converter.
 *
 * Concrete converter implementations for Celsius scale
 */
class CelsiusTemperatureScaleConverter extends AbstractTemperatureScaleConverter
{

    @Override
    public Temperature createTemperature(float degrees)
    {
        return new Temperature(degrees);
    }

    @Override
    public float convertTemperature(Temperature temp)
    {
        return temp.getTemperature();
    }
}
