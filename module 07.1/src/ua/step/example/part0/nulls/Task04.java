package ua.step.example.part0.nulls;

/**
 * Ошибка в foreach
 */
public class Task04
{
    public static void main(String[] args)
    {
        int[] mas = null;
        // нельзя делать foreach по не существующим объектам
        for (int element : mas)
        {
            System.out.println(element);
        }
    }
}
