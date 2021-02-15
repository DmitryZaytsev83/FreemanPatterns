package ru.dmitryzaytsev.observer;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private int temperature;
    private int humidity;
    private int pressure;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    private ISubject weatherData;


    @Override
    public void display() {
        System.out.printf("Current conditions: %d C, %d , %d mm%n",
                temperature, humidity, pressure);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
