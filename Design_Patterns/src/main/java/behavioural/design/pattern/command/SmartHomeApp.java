package behavioural.design.pattern.command;

public class SmartHomeApp {

    static void main() {

        Light light = new Light();
        ThermoStat thermoStat = new ThermoStat();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        Command setTemp = new SetTemperatureCommand(thermoStat, 24);

        RemoteControll controll = new RemoteControll();

        IO.println("================== Execute Command =========================");
        controll.executeCommand(lightOn);
        controll.executeCommand(setTemp);
        controll.executeCommand(lightOff);

        IO.println("================== Undo Command ==============================");

        controll.undoLast();
        controll.undoLast();
    }
}
