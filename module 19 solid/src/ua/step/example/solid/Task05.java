package ua.step.example.solid;

import ua.step.example.solid.model4.I.Animal;
import ua.step.example.solid.model4.I.Cat;

/**
 * I - дроби интерфейсы
 */
public class Task05
{
    public static void main(String[] args)
    {
        Animal animal = new Cat();
        go(animal);

    }

    public static void go(Animal animal)
    {
        animal.eat();
        animal.jump();
        animal.swim();
        animal.fly();
    }
}
