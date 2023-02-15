package observerPattern.displays;

import observerPattern.DisplayElement;
import observerPattern.Observer;
import observerPattern.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    //instance variable of interface Subject
    private Subject weatherData;

    //constructor is used to register the observer in the WeatherData class by using object of subject so that we can
    //use registerObserver method
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("current conditions:temperature:"+temperature+"humidity:"+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}

