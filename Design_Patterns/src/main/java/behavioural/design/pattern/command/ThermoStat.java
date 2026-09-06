package behavioural.design.pattern.command;

public class ThermoStat {

    private int currentTemperature = 20;

    public void setTemperature(int temp) {

        IO.println("Thermostat set to " + temp + "C");
        currentTemperature = temp;
    }

    public int getTemperature(){

        return currentTemperature;
    }
}
