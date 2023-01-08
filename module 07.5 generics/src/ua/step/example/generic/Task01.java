package ua.step.example.generic;

import ua.step.example.generic.model.Box;
import ua.step.example.generic.model.Melon;

public class Task01
{
    public static void main(String[] args)
    {
        // типизируем ящик при его создании
        Box<Melon> box = new Box<>();
        Melon melon = new Melon();
        // помешаем объект дыня в ящик методом put
        box.put(melon);

        // не нужно делать приведение типов
        Melon melon1 = box.get();
        System.out.println("Достали " + melon1);

        // теперь нельзя поместить в ящик объекты других типов 
        //box.put("Дыня");

        // здесь ошибка, так как в ящик поместили объкт типа String
    }
}