package ua.step.example;

/**
 * 
 * Возникновение исключения во время работы программы
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        int a = 4; 
        // TODO деление целых чисел на ноль недопустимо и вызывает исключительную ситуацию
        System.out.println(a / 0); 
        System.out.println(a/0.0); // в отличии от дробных
    }
}
