package experiment;

/**
 * Original Concrete Temperature Conversion Template.
 *
 * Steps implemented to approximate discussion original.
 */
class OriginalTemperatureConversionTemplate extends AbstractTemperatureConversionTemplate
{

    @Override
    protected int getSelectedOperation()
    {
        int userSelectedOperation;

        do
        {
            userSelectedOperation = ConsoleUtils.promptForInt(
                "Enter:"
                + "\n  1 to convert F->C"
                + "\n  2 to convert C->F"
                + "\n  3 to quit"
                + "\nYour selection? [1-3]: ");

            if (userSelectedOperation < 1 || userSelectedOperation > 3)
            {
                System.out.println("Invalid Selection: You must enter [1-3]");
            }

        } while (userSelectedOperation < 1 || userSelectedOperation > 3);

        return userSelectedOperation;
    }

    @Override
    protected boolean operationInterrupted(int operation)
    {
        return operation == 3;
    }

    @Override
    protected String getSourceScale(int operation)
    {
        switch (operation)
        {
            case 1:
                return Temperature.FAHRENHEIT_SCALE;
            default:
                return Temperature.CELSIUS_SCALE;
        }
    }

    @Override
    protected String getTargetScale(int operation)
    {
        switch (operation)
        {
            case 2:
                return Temperature.FAHRENHEIT_SCALE;
            default:
                return Temperature.CELSIUS_SCALE;
        }
    }

    @Override
    protected float getTemperatureInput(int operation)
    {
        return ConsoleUtils.promptForFloat(
            String.format("Enter a temperature in %s: ",
                getSourceScale(operation)));
    }

    @Override
    protected void outputConversionResults(int operation,
        float sourceDegrees, float targetDegrees)
    {
        System.out.println(
            sourceDegrees
            + " degrees "
            + getSourceScale(operation)
            + " equals "
            + targetDegrees
            + " degrees "
            + getTargetScale(operation));
    }
}
