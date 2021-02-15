package ru.dmitryzaytsev.observer;

public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
