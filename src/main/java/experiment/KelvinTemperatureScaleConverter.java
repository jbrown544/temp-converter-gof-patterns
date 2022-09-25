package experiment;

/**
 * Kelvin Temperature Scale Converter.
 *
 * Concrete converter implementations for Kelvin scale.
 */
class KelvinTemperatureScaleConverter extends AbstractTemperatureScaleConverter
{

    @Override
    public Temperature createTemperature(float degrees)
    {
        return Temperature.fromKelvin(degrees);
    }

    @Override
    public float convertTemperature(Temperature temp)
    {
        return temp.toDegreesKelvin();
    }
}
