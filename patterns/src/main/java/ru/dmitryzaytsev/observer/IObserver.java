package ru.dmitryzaytsev.observer;

public interface IObserver {
    void update(int temperature, int humidity, int pressure);
}
