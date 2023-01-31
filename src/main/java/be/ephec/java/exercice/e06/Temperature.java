package be.ephec.java.exercice.e06;

public class Temperature {

    private double temperature;
    private TemperatureUnit unit;

    public Temperature (double temperature, TemperatureUnit unit)
    {
        this.temperature = temperature;
        this.unit = unit;
    }
    public double getValue(TemperatureUnit unit)
    {
        if (this.unit == unit)
        {
            return temperature;
        }
        else if (unit == TemperatureUnit.CELSIUS && this.unit == TemperatureUnit.FAHRENHEIT ) {
            return (temperature -32) *5./9;
        }
        else
        {
            return temperature * 9 /5 +32;
        }
    }
    public void setValue (double value, TemperatureUnit unit)
    {
        this.temperature = value;
        this.unit = unit;
    }
}
