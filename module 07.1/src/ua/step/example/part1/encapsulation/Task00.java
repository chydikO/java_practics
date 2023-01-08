package ua.step.example.part1.encapsulation;

/**
 * 
 * Инкапсуляция способствует локализации изменений
 * 
 */
public class Task00
{

    public static void main(String[] args)
    {
        // создаем объект класса Прямоугольник
        Rectangle rectangle = new Rectangle();
        // утсанавливаем стороны
        rectangle.width = 10;
        rectangle.height = 5;
        
        if (!rectangle.hasError()) {
            rectangle.print();    
        }
        // FIXME исправь код метода main таким образом, что в случае если ширина или
        // длина прямоугольника меньше или равна 0, вместо информации о периметре и
        // площади, выводилось соообщение об ошибке (используй метод hasError
        // объявленный у классе Rectangle, как в примере выше).
        
        rectangle = new Rectangle();
        rectangle.width = 0;
        rectangle.height = -1;
        rectangle.print();

        rectangle = new Rectangle();
        rectangle.width = -1;
        rectangle.height = 2;
        rectangle.print();

        rectangle = new Rectangle();
        rectangle.width = -2;
        rectangle.height = -2;
        rectangle.print();
    }
}

/*******************************************************************************
 * Данный класс представляет абстракцию объектов прямоугольник.
 ******************************************************************************/
class Rectangle
{
    // FIXME инкапсулируйте поля класса
    int width = 5;

    int height = 5;

    int getArea()
    {
        return width * height;
    }

    int getPerimeter()
    {
        return 2 * (width + height);
    }

    public boolean hasError()
    {
        if (width <= 0 && height <= 0)
        {
            System.out.println("Неверная ширина и высота");
            return true;
        }
        else if (width <= 0)
        {
            System.out.println("Неверная ширина");
            return true;
        }
        else if (height <= 0)
        {
            System.out.println("Неверная высота");
            return true;
        }
        return false;
    }

    public void print()
    {
        //if (!hasError()) {
            System.out.printf("narea = %d perimeter = %2d%n", getArea(), getPerimeter());    
        //}
    }
}