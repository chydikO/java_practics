package ua.step.example.part1.string;

/**
 * 
 * Поиск в строке. Практика
 *
 */
public class Task13
{
    public static void main(String[] args)
    {
        String readme = "read.me.txt";
        // поиск справа-налево, будет найдено в какой позиции справа находится первая точка
        int index = readme.lastIndexOf(".");
        // вырезаем с ночала и до найденого совпадения
        System.out.println(readme.substring(0, index));
   }
}