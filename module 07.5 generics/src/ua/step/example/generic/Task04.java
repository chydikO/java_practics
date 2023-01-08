package ua.step.example.generic;

import ua.step.example.generic.model.Box;
import ua.step.example.generic.model.RottenApple;

/**
 * Поскольку boxRottenApple имеет тип Box<RottenApple>, добавление Apple к нему
 * выглядит совершенно легальным. Но если boxRottenApple присвоить boxApple, то
 * это нарушило бы независимость от типа, который явно указан при определении
 * boxRottenApple (что boxRottenApple - это ящик с гнилыми яблоками), вот почему
 * родовые (generic) типы не могут быть ковариантными.
 * 
 */
public class Task04
{
    public static void main(String[] args)
    {
        Box<RottenApple> boxRottenApple = new Box<RottenApple>();
        //boxRottenApple.put(new Apple());
        // Box<Apple> boxApple = boxRottenApple; // не верно

    }
}
