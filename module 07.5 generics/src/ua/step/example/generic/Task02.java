package ua.step.example.generic;

import ua.step.example.generic.model.Apple;
import ua.step.example.generic.model.Box;
import ua.step.example.generic.model.Melon;

/**
 * 
 * Ограничение шаблонных типов
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Box<Melon> boxMelon = new Box<>();
        boxMelon.put(new Melon());
        openBox(boxMelon);

        Box<Apple> boxApple = new Box<>();
        boxApple.put(new Apple());
        
        // openBox(boxApple);
    }
    
    public static void openBox(Box<Melon> box)
    {
        box.get();
    }
}