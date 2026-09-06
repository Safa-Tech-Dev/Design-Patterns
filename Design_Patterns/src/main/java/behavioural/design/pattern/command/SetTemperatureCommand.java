package behavioural.design.pattern.command;

public class SetTemperatureCommand implements Command{

    private final ThermoStat thermoStat;
    private final int newTemperature;
    private int previousTemperature;

    public SetTemperatureCommand(ThermoStat thermoStat, int temperature) {
        this.thermoStat = thermoStat;
        this.newTemperature = temperature;
    }

    @Override
    public void execute() {

        previousTemperature = thermoStat.getTemperature();
        thermoStat.setTemperature(newTemperature);
    }

    @Override
    public void undo() {

        thermoStat.setTemperature(previousTemperature);
    }
}
