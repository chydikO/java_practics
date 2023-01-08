package ua.step.example.generic;

import ua.step.example.generic.model.Melon;
import ua.step.example.generic.model.SimpleBox;

public class Task00
{
    public static void main(String[] args)
    {
        SimpleBox box = new SimpleBox();
        Melon melon = new Melon();
        // помешаем объект дыня в ящик методом put
        box.put(melon);

        // достаем объект из ящика методом get
        // так как метод get возвращает тип Object необходимо сделать расширение
        // типа
        melon = (Melon) box.get();
        System.out.println("Достали " + melon);

        // вместо объекта типа Melon помешаем в ящик объект типа String
        box.put("Дыня");

        // здесь ошибка, так как в ящик поместили объкт типа String
        melon = (Melon) box.get();

        System.out.println("Достали " + melon);
    }
}
