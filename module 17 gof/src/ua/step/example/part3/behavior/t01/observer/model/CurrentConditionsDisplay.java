package ua.step.example.part3.behavior.t01.observer.model;

public class CurrentConditionsDisplay implements Observer
{
    private float temperature;
    private float humidity;
    private int pressure;
    
    public CurrentConditionsDisplay(WeatherData weatherData) {

        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("Сейчас значения:%.1f градусов цельсия и %.1f %% влажности. Давление %d мм рт. ст.\n", temperature, humidity, pressure);
    }
}
