package behavioural.design.pattern.observer;

public class CurrentConditionDisplay implements WeatherObserver{
    @Override
    public void update(WeatherSubject subject) {

        // TODO: Print "Current Conditions -> Temp: X, Humidity: Y%, Pressure: Z hPa"
        System.out.println("Current Conditions -> Temp: " + subject.getTemperature() + ", "
                + "Humidity: " + subject.getHumidity() + "%, "
                + "Pressure: " + subject.getPressure() + " hPa");
    }
}
