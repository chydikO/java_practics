package ua.step.example.part4.regexp;

/**
 * 
 * Регулярные выражения
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        String regular = "[a-z]+";
        System.out.println("unguryan".matches(regular));
        System.out.println("unguryan@itstep.org".matches(regular));
        // FIXME исправь шаблон, чтобы вторая строка тоже прошла проверку
    }
}