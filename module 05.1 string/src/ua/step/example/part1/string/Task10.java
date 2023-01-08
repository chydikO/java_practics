package ua.step.example.part1.string;

/**
 * Сопостовление строк
 */
public class Task10
{
    public static void main(String[] args)
    {
        String testString = "Котёнок";
        if (testString.compareTo("котёнок") == 0)
        {
            System.out.println("Строки равны");
        }
        else
        {
            System.out.println("Строки не равны. Возвращено " + testString.compareTo("котёнок"));
        }
        // FIXME используй метод compareToIgnoreCase чтобы строки были равны
    }
}