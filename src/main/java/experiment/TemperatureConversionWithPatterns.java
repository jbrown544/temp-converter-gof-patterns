package experiment;

/**
 * Main Program Class.
 *
 * @author James Brown
 */
public class TemperatureConversionWithPatterns
{

    /**
     * Program entry point.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args)
    {
        AbstractTemperatureConversionTemplate template = getTemplate();

        TemperatureConversionStrategy strategy = new TemperatureConversionStrategy();

        while (template.doConversion(strategy))
        {
            System.out.println("=====");
        }

        System.out.println("Have a great day!");
    }

    private static AbstractTemperatureConversionTemplate getTemplate()
    {
        switch (ConsoleUtils.promptForInt(
            "Enter:"
            + "\n  1 for the Enhanced Template"
            + "\n  2 for the Original Template"
            + "\nYour selection? [1-2]: "))
        {
            case 1:
                return new EnhancedTemperatureConversionTemplate();

            default:
                return new OriginalTemperatureConversionTemplate();

        }
    }
}
