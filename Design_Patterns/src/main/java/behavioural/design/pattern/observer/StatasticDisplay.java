package behavioural.design.pattern.observer;

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
