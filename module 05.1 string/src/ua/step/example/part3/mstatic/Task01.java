package ua.step.example.part3.mstatic;

/**
 * 
 * Преобразование примитивных типв в строчное представление
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        // вызов статического метода valueOf
        int x = 33;
        String s1 = String.valueOf(x);
        System.out.println(s1);

        // из строки в целое число типа int
        int i = Integer.parseInt(s1);

        System.out.println(String.valueOf(i + 2));

        s1 = String.valueOf(1.5f);
        System.out.println(s1);

        System.out.println(String.valueOf(true ^ true));
    }
}