package ua.step.example.part1.encapsulation;

import ua.step.example.part2.encapsulation.model.TrafficLight;

/**
 * Практическое задание - открытые методы как средство изменения состояния
 * объекта
 */
public class Task03
{
    public static void main(String[] args)
    {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.toSwitch();
        trafficLight.toSwitch();
        trafficLight.toSwitch();
        // FIXME измени класс TrafficLight таким образом, чтобы программа
        // выводила цвета светофора в порядке ЗЕЛЕНЫЙ, ЖЕЛТЫЙ, КРАСНЫЙ, ЖЕЛТЫЙ,
        // ЗЕЛЕНЫЙ и т.д.

    }
}
