package ua.step.example.generic;

import ua.step.example.generic.model.Apple;
import ua.step.example.generic.model.Box;
import ua.step.example.generic.model.Melon;

/**
 * Последняя строка вызовет исключительную ситуацию ClassCastException,
 * поскольку вы попытались вставить Box<Integer> в Box<String>. Поскольку
 * ковариантность массива могла бы позволить вам нарушить независимость родового
 * типа, создание экземпляра массивов родовых типов (за исключением типов,
 * аргументы которых являются неограниченными групповыми символами) была
 * запрещена
 * 
 */
public class Task05
{
    public static void main(String[] args)
    {
        // нельзя создать массив генерик типов
        // Box<Apple>[] box = new Box<Apple>[10];

        // но можно создать массив ящиков неопределенных типов
        Box<?>[] box = new Box<?>[10];
        
        // в такой массив можно положить различные ящики
        box[0] = new Box<Apple>();
        box[0] = new Box<Melon>();

        // такое приведение типова корректно Box<?> является подтипом Object
        Object[] objectBox = box;
        
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.put(new Apple());
        box[0] = appleBox;

    }
}