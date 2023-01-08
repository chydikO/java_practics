package ua.step.example;

/**
 * 
 * Возврат значения из метода и исключения. 
 * 
 */
public class Task12
{
    public static void main(String[] args)
    {
        sqr(9);
    }

    /*
     * согласно объявлению метода ты должен вернуть double
     */
    public static double sqr(double arg)
    {
        long time = System.currentTimeMillis();
        if (time % 2 == 0)
        {
            return arg * arg; // ок, вот твой double
        }
        else if (time % 2 == 1)
        {
            System.out.println("я решил повиснуть");
            while (true); 
        }
        else
        {
            throw new RuntimeException(); // или бросить исключение
        }
    }
}