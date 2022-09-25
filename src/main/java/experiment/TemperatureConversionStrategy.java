package experiment;

/**
 * Temperature Conversion Strategy.
 *
 * Temperature conversion operations delegated to dynamically configured
 * converters for source and target scales.
 */
class TemperatureConversionStrategy extends AbstractTemperatureScaleConverter
{

    private AbstractTemperatureScaleConverter sourceConverter;
    private AbstractTemperatureScaleConverter targetConverter;

    public TemperatureConversionStrategy()
    {
        this.configure("", "");
    }

    public final void configure(String sourceScale, String targetScale)
    {
        sourceConverter = getTemperatureConverter(sourceScale);
        targetConverter = getTemperatureConverter(targetScale);
    }

    private AbstractTemperatureScaleConverter getTemperatureConverter(String scale)
    {
        switch (scale)
        {
            case Temperature.KELVIN_SCALE:
                return new KelvinTemperatureScaleConverter();
            case Temperature.FAHRENHEIT_SCALE:
                return new FahrenheitTemperatureScaleConverter();
            default:
                return new CelsiusTemperatureScaleConverter();
        }
    }

    @Override
    public Temperature createTemperature(float degrees)
    {
        return sourceConverter.createTemperature(degrees);
    }

    @Override
    public float convertTemperature(Temperature temperature)
    {
        return targetConverter.convertTemperature(temperature);
    }
}
