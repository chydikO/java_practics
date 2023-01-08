package ua.step.example.part2.list;

import java.util.List;
import java.util.Random;

public class Task04
{
    public static void main(String[] args)
    {
        // FIXME сравните по времени время добавления в конец списка у
        // реализаций ArrayList и LinkedList используя метод addToEnd

        // FIXME сравните по времени время добавления в середину списка у
        // реализаций ArrayList и LinkedList используя метод addToRandom

        // FIXME дописать метод удаления из середины списка и сравните время
        // удаления в списках реализаций ArrayList и LinkedList используя метод addToRandom
    }

    private static void addToEnd(List<Integer> list, int number)
    {
        Random rnd = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < number; i++)
        {
            list.add(rnd.nextInt());
        }
        System.out.printf("%s for n %d time %d", list.getClass().getName(),
                number, System.nanoTime() - startTime);
    }

    private static void addToRandom(List<Integer> list, int number)
    {
        Random rnd = new Random();
        long startTime = System.nanoTime();
        list.add(rnd.nextInt());
        for (int i = 0; i < number - 1; i++)
        {
            int index = rnd.nextInt(i + 1);
            list.add(index, rnd.nextInt());
        }
        System.out.printf("%s for n = %d time %d", list.getClass().getName(),
                number, System.nanoTime() - startTime);
    }
}
