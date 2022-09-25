package experiment;

/**
 * Abstract Temperature Conversion Template.
 *
 * Conversion playbook without step implementations.
 */
abstract class AbstractTemperatureConversionTemplate
{

    public boolean doConversion(TemperatureConversionStrategy strategy)
    {
        int operation = getSelectedOperation();

        if (!operationInterrupted(operation))
        {
            strategy.configure(getSourceScale(operation), getTargetScale(operation));

            float sourceDegrees = getTemperatureInput(operation);

            Temperature temperature = strategy.createTemperature(sourceDegrees);

            float targetDegrees = strategy.convertTemperature(temperature);

            outputConversionResults(operation, sourceDegrees, targetDegrees);
        }

        return !operationInterrupted(operation);
    }

    protected abstract int getSelectedOperation();

    protected abstract boolean operationInterrupted(int operation);

    protected abstract String getSourceScale(int operation);

    protected abstract String getTargetScale(int operation);

    protected abstract float getTemperatureInput(int operation);

    protected abstract void outputConversionResults(int operation,
        float sourceDegrees, float targetDegrees);
}
