package ua.step.example.part1.enumeration;

import ua.step.example.part1.enumeration.model.Direction;

/**
 * 
 * Методы в перечислениях
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        Direction direction = Direction.down;
        System.out.println(direction.opposite());
    }
}
