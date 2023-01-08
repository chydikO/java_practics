package ua.step.example.part3.mstatic;

/**
 * 
 * Объединение строк с вставкой разделителя. Метод добавлен в java 8
 *
 */
public class Task09
{
    public static void main(String[] args)
    {
        String message = String.join("-", "Java", "is", "cool");
        System.out.println(message);
    }
}