package ua.step.example.part3.behavior.t01.observer;

import ua.step.example.part3.behavior.t01.observer.model.CurrentConditionsDisplay;
import ua.step.example.part3.behavior.t01.observer.model.Observer;
import ua.step.example.part3.behavior.t01.observer.model.WeatherData;

/**
 * В примере описывается получение данных от метеорологической станции (класс
 * WeatherData, рассылатель событий) и использование их для вывода на экран
 * (класс CurrentConditionsDisplay, слушатель событий). Слушатель регистрируется
 * у наблюдателя с помощью метода registerObserver (при этом слушатель заносится
 * в список observers). Регистрация происходит в момент создания объекта
 * currentDisplay, т.к. метод registerObserver применяется в конструкторе. При
 * изменении погодных данных вызывается метод notifyObservers, который в свою
 * очередь вызывает метод update у всех слушателей, передавая им обновлённые
 * данные.
 */
public class Task01
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        
        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
