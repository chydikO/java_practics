package ua.step.example.part1.gc;

/**
 * Переполненеи кучи
 */
public class Task02
{
    public static void main(String[] args)
    {
        int[][] mas = new int[100000][];
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = new int[i];
            System.out.printf("total: %d free: %d%n", Runtime.getRuntime().totalMemory(),
                    Runtime.getRuntime().freeMemory());
        }
    }
}
