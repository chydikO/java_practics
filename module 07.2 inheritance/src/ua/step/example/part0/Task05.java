package ua.step.example.part0;

import ua.step.example.part0.model.animal.Animal;
import ua.step.example.part0.model.animal.Cat;
import ua.step.example.part0.model.animal.Dog;
import ua.step.example.part0.model.animal.TomCat;

/**
 * 
 * Ключевое слово instanceof. Используя оператор instanceof, можно узнать, от
 * какого класса произошел объект. Этот оператор имеет два аргумента. Слева
 * указывается ссылка на объект, а справа — имя типа, на совместимость с которым
 * проверяется объект.
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        Animal cat = new Cat();
        whoIs(cat);
        // Animal dog = new Dog();
        // whoIs(dog);
        // Animal animal = new Animal();
        // whoIs(animal);
        // animal = new TomCat();
        // whoIs(animal);
        // cat = null;
        // whoIs(cat);
    }
    
    // полиморфный метод
    static void whoIs(Animal animal)
    {
        // возвращает истину если переменная animal содержит ссылку на объект
        // кот
        boolean b1 = animal instanceof Cat;
        // возвращает истину если переменная animal содержит ссылку на объект
        // собака
        boolean b2 = animal instanceof Dog;
        // возвращает истину если переменная animal содержит ссылку на объект
        // собака или кот или животное
        boolean b3 = animal instanceof Animal;
        System.out.println("это животное кот " + b1);
        System.out.println("это животное собака " + b2);
        System.out.println("это животное " + b3);
        if (b1)
        {
            System.out.println("это животное кот Том " + (animal instanceof TomCat));
        }
        System.out.println("==========================");
    }
}