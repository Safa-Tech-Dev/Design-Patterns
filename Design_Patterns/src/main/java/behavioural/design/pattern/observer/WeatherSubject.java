package behavioural.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {

    private double temperature;
    private double humidity;
    private double pressure;

    private List<WeatherObserver> observers = new ArrayList<>();

    public void registerObserver(WeatherObserver observer) {

        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {

        observers.remove(observer);

    }

    public void notifyObservers() {

        for(WeatherObserver observer : observers){

            observer.update(this);
        }
    }

    public void setMeasurement(double temperature, double humidity, double pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
