package ua.step.example.part2.equals;

/**
 * 
 * Сравнение строк
 * 
 */
public class Task00
{
    public static void main(String[] args)
    {
        String cat1 = "кот";
        String cat2 = "кот";
        String spaceCat = " кот ".trim();
        
        // строки совпадают 
        System.out.printf("%s == %s %b%n", cat1, cat2, cat1 == cat2);
        // строки НЕ совпадают 
        System.out.printf("%s <> %s %b%n", cat1, spaceCat, cat1 == spaceCat);
    }
}