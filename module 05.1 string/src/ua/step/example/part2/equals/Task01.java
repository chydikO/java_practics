package ua.step.example.part2.equals;

/**
 * 
 * Сравнение строк методом эквивалентности equals
 * 
 */
public class Task01
{
    public static void main(String[] args)
    {
        String cat = "кот";
        String spaceCat = " кот ".trim();
        if (cat.equals(spaceCat))
        {
            System.out.println("Строки совпадают");
        }
        else
        {
            System.out.println("Строки не совпадают");
        }
    }
}