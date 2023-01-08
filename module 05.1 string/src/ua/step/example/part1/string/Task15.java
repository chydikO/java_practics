package ua.step.example.part1.string;

/**
 * 
 * Преобразование регистра букв
 *
 */
public class Task15
{
    public static void main(String[] args)
    {
        String source = "кОтЁнОк";
        // уменьшение регистра всех букв
        System.out.println(source.toLowerCase());
        
        // увеличения регистра всех букв
        System.out.println(source.toUpperCase());
        System.out.println(source);

        for (int i = 0; i < source.length(); i++)
        {
            char symbol = source.charAt(i);
            // проверка находится ли символ в нижнем регистре 
            System.out.print(" " + Character.isLowerCase(symbol));
        }
    }
}