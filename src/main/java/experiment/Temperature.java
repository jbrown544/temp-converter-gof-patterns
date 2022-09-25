package experiment;

/**
 * General Temperature Class.
 *
 * This implementation records temperature value in Celsius.
 *
 * Static methods are provided to import from other scales and instance methods
 * to export to other scales.
 */
class Temperature
{

    public static final String KELVIN_SCALE = "Kelvin";
    public static final String FAHRENHEIT_SCALE = "Fahrenheit";
    public static final String CELSIUS_SCALE = "Celcius";

    private static final float KELVIN_OFFSET = 273.15F;
    private static final float FAHRENHEIT_FREEZES_WATER = 32F;
    private static final float FAHRENHEIT_TO_CELSIUS = 5F / 9F;

    public static Temperature fromKelvin(float degreesKelvin)
    {
        return new Temperature(degreesKelvin - KELVIN_OFFSET);
    }

    public static Temperature fromFahrenheit(float degreesFahrenheit)
    {
        return new Temperature(FAHRENHEIT_TO_CELSIUS
            * (degreesFahrenheit - FAHRENHEIT_FREEZES_WATER));
    }

    private final float DEGREES_CELSIUS;

    public Temperature(float degreesCelcius)
    {
        this.DEGREES_CELSIUS = degreesCelcius;
    }

    public float getTemperature()
    {
        return DEGREES_CELSIUS;
    }

    public float toDegreesKelvin()
    {
        return DEGREES_CELSIUS + KELVIN_OFFSET;
    }

    public float toDegreesFahrenheit()
    {
        return (1 / FAHRENHEIT_TO_CELSIUS)
            * DEGREES_CELSIUS + FAHRENHEIT_FREEZES_WATER;
    }

}
