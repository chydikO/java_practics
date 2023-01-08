package ua.step.example.part0;

import ua.step.example.part0.model.animal.Animal;
import ua.step.example.part0.model.animal.Cat;
import ua.step.example.part0.model.animal.Dog;

/**
 * 
 * Преобразование ссылочных типов
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        //Animal animal = new Cat();
        //Animal animal = new Dog();
        // FIXME оставь только такой код, который не приведет к ошибке ClassCastException
        
        // Понижающее абстракцию преобразование (расширяющее)
        // Обратное преобразование возможно только если объект был создан от
        // класса к которому производим downcasting.
        Cat cat = (Cat) animal;

        System.out.println(cat.sound());
    }
}