package experiment;

/**
 * Abstract Temperature Scale Converter.
 *
 * Temperature converter operations without implementations.
 */
abstract class AbstractTemperatureScaleConverter
{

    public abstract Temperature createTemperature(float degrees);

    public abstract float convertTemperature(Temperature temperature);

}
