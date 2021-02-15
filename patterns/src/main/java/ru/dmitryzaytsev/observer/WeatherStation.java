package ru.dmitryzaytsev.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new
                CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(25, 70, 760);
        weatherData.setMeasurements(24, 80, 750);
        weatherData.setMeasurements(22, 90, 740);
    }
}
