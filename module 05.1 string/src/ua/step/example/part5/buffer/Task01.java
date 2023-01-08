package ua.step.example.part5.buffer;

/**
 * Добавление объектов в строчный буфер
 */
public class Task01
{
    public static void main(String[] args)
    {
        // класс отвечающий за динамические строки
        StringBuffer sb = new StringBuffer("test");
        // sb = "test";
        System.out.println(sb);
        // добавление в буфер символа и строки
        sb.append('-').append("test");
        // добавление в буфер значения boolean
        sb.append(true);
        // добавление в буфер числа
        sb.append(123);
        System.out.println(sb);

        String s1 = sb.toString();
        System.out.println(s1);

        System.out.println(sb.length()); // количество символов в буффере
    }
}