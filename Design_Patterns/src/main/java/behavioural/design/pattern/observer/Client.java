package behavioural.design.pattern.observer;

public class Client {

    static void main() {

        WeatherSubject weatherSubject = new WeatherSubject();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        StatasticDisplay statasticDisplay = new StatasticDisplay();

        weatherSubject.registerObserver(currentConditionDisplay);
        weatherSubject.registerObserver(statasticDisplay);

        weatherSubject.setMeasurement(23.0, 53.0, 1025.0);
        weatherSubject.setMeasurement(28.0, 65.0, 1012.0);
        weatherSubject.setMeasurement(30.0, 78.0, 1015.0);

    }
}
