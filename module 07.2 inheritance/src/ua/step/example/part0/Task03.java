package ua.step.example.part0;

import ua.step.example.part0.model.animal.Animal;
import ua.step.example.part0.model.animal.Cat;
import ua.step.example.part0.model.animal.Dog;
import ua.step.example.part0.model.animal.TomCat;

/**
 * 
 * Преобразование ссылочных типов является основой на которой построен
 * принцип полиморфизма
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        // создаем массив для хранения животных
        Animal[] animals = new Animal[3];

        // создаем объекты классов и помещаем ссылки на них в массив
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new TomCat();

        // вызов полиморфного метода
        playSound(animals);
    }

    // полиморфный метод
    public static void playSound(Animal[] animals)
    {
        for (Animal animal : animals)
        {
            // вызываем метод класса родителя
            System.out.println(animal.sound());
            if (animal.isHungry()) {
                animal.eat();    
            }
        }
    }
}