package ua.step.example.solid;

import ua.step.example.solid.model2.O.Rectangle;

/**
 * O - Открыт для расширение и закрыт для изменения
 */
public class Task03
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 5;
        rectangle.width = 2;
        double area = AreaCalculator.calculateRectangleArea(rectangle);
        System.out.println(area);
    }
}

class AreaCalculator
{
    public static double calculateRectangleArea(Rectangle rectangle)
    {
        return rectangle.length * rectangle.width;
    }
}

interface Shape
{
    public double calculateArea();
}