package ua.step.example.part0.nulls;

/**
 * 
 * Ошибка при распаковке
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        // int i = null; // ошибка
        Integer integerValue = null; // это нормально
        System.out.println(integerValue);
        
        // это все еще нормально, но тут будет брощено NullPointerException
        int j = integerValue;
        System.out.println(j);
        
    }
}