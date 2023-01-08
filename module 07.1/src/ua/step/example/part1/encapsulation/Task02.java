package ua.step.example.part1.encapsulation;

import ua.step.example.part2.encapsulation.model.Car;

/**
 * 
 * Интерфейсы класса и реализации.
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Car car = new Car();
        // car.setKey(); 
        car.drive(); // использование интерфейса класса
        
     // FIXME
     // добавьте в класс Car поле с количеством топлива, измените реализацию таким
     // образм, что если машина не заправлена, она не заводится
    }
}
