package ua.step.example.part3.behavior.t01.observer.model;

public interface Observable
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
