package ua.step.example.part0;

import ua.step.example.part0.model.animal.Animal;
import ua.step.example.part0.model.animal.Cat;
import ua.step.example.part0.model.animal.Dog;

/**
 * 
 * Переопределение методов.
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        kick(cat);
        Dog dog = new Dog();
        kick(dog);
    }

    // полиморфный метод - пнуть животное
    public static void kick(Animal animal)
    {
        System.out.println(animal.sound());
    }
}