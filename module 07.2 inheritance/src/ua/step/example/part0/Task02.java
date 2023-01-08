package ua.step.example.part0;

import ua.step.example.part0.model.animal.Animal;
import ua.step.example.part0.model.animal.Cat;

/**
 * 
 * Преобразование ссылочных типов 
 *
 */
public class Task02
{
    public static void main(String[] args)
    {	
    	// Формальное преобразование (повышающее абстракцию)
        // Ссылку на объект sub класса всегда можно присвоить ссылке которая
        // имеет тип супер класса.
        
        // Сам объект при таком преобразовании не изменяется, преобразование
        // относится только к типу ссылки на объект.
    	// Тем самым, мы можем рассматривать наследников, как объекты класса родителя.
        Animal animal = new Cat();
        System.out.println(animal.sound());
    }
}