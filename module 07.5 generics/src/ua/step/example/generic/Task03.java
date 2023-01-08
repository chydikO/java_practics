package ua.step.example.generic;

import ua.step.example.generic.model.Box;
import ua.step.example.generic.model.Melon;

/**
 * 
 * Wildcards. Переупаковка
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        Box<Melon> box1 = new Box<>();
        box1.put(new Melon());
        openBox(box1);
    }

    private static void openBox(Box<?> box)
    {
        System.out.println(box.get());
    }

}