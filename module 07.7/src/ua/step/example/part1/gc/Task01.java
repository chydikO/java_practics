package ua.step.example.part1.gc;

/**
 * 
 * Передача команды на вызов сборщика муссора.
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        // так
        System.gc();
        // или так
        Runtime.getRuntime().gc();
    }
}
