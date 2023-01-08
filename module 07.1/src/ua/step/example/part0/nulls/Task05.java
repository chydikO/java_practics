package ua.step.example.part0.nulls;

/**
 * Ошибка при использовании StringBuilder
 */
public class Task05
{
    public static void main(String[] args)
    {
        String str = null;
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
    }
}