package ua.step.example.solid.model3.L;

/**
 * 
 * Квадрат - это всего лишь частный случай прямоугольника. Поэтому кажется
 * логичным унаследовать его от класса прямоугольник.
 *
 */
public class Square extends Rectangle
{
    @Override
    public void setBreadth(int breadth)
    {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }

    @Override
    public void setLength(int length)
    {
        super.setLength(length);
        super.setBreadth(length);
    }
}
