package ua.step.example.generic;


/**
 * Шаблонные методы
 */
public class Task07
{
    public static void main(String[] args)
    {
        print(new Integer(33));
        print(new Boolean("true"));
    }
    
    // шаблонный метод
    public static <T> void print(T number) {
        System.out.println(number);
    }
}
