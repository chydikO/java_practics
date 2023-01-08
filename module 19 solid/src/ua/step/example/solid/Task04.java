package ua.step.example.solid;

import ua.step.example.solid.model3.L.Rectangle;
import ua.step.example.solid.model3.L.Square;

/**
 * L - наследуйся правильно
 */
public class Task04
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Square();
        rectangle.setBreadth(2);
        rectangle.setLength(3);
        System.out.println(rectangle.getArea());
    }
}