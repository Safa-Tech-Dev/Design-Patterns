package behavioural.design.pattern;

import behavioural.design.pattern.observer.WeatherObserver;
import behavioural.design.pattern.observer.WeatherSubject;

import java.util.ArrayList;
import java.util.List;

public class StatasticDisplay implements WeatherObserver {

    private List<Double> readings = new ArrayList<>();

    @Override
    public void update(WeatherSubject subject) {

        readings.add(subject.getTemperature());

        double tempSum = 0;
        for(Double t : readings){
            tempSum += t;
        }
        double tempAvg = tempSum / readings.size();
        System.out.println("Statistics -> Avg Temperature: " + tempAvg);
    }
}
