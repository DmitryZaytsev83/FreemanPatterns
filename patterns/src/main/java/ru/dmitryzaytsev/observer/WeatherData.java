package ru.dmitryzaytsev.observer;

import java.util.ArrayList;

public class WeatherData implements ISubject {
    private int temperature;
    private int humidity;
    private int pressure;
    private final ArrayList observers;

    public WeatherData() {
        observers = new ArrayList();
    }


    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            IObserver observer = (IObserver) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
