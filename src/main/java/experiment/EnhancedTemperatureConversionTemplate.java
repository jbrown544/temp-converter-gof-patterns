package experiment;

/**
 * Improved Concrete Temperature Conversion Template.
 *
 * This overrides portions of the original including new menu options.
 */
class EnhancedTemperatureConversionTemplate extends OriginalTemperatureConversionTemplate
{

    @Override
    protected int getSelectedOperation()
    {
        int userSelectedOperation;

        do
        {
            userSelectedOperation = ConsoleUtils.promptForInt(
                "Enter:"
                + "\n  1 to convert K->F"
                + "\n  2 to convert K->C"
                + "\n  3 to convert F->K"
                + "\n  4 to convert F->C"
                + "\n  5 to convert C->K"
                + "\n  6 to convert C->F"
                + "\n  7 to quit"
                + "\nYour selection? [1-7]: ");

            if (userSelectedOperation < 1 || userSelectedOperation > 7)
            {
                System.out.println("Invalid Selection: You must enter [1-7]");
            }

        } while (userSelectedOperation < 1 || userSelectedOperation > 7);

        return userSelectedOperation;
    }

    @Override
    protected boolean operationInterrupted(int operation)
    {
        return operation == 7;
    }

    @Override
    protected String getSourceScale(int operation)
    {
        switch (operation)
        {
            case 1:
            case 2:
                return Temperature.KELVIN_SCALE;
            case 3:
            case 4:
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
            case 3:
            case 5:
                return Temperature.KELVIN_SCALE;
            case 1:
            case 6:
                return Temperature.FAHRENHEIT_SCALE;
            default:
                return Temperature.CELSIUS_SCALE;
        }
    }
}
