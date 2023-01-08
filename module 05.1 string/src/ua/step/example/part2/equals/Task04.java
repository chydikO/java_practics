package ua.step.example.part2.equals;

/**
 * 
 * Безопасное сравнение строк.
 * Метод equals может принимаьт и обрабатывать без ошибок значение строки в виде null
 */
public class Task04
{
    @SuppressWarnings("null")
    public static void main(String[] args)
    {
        String str = null;
        if (str.equals("test"))
        {
            System.out.println(str);
        }
        // FIXME исправь строку кода 14, таким бразом чтобы не было ошибки во
        // время выполнения
    }
}