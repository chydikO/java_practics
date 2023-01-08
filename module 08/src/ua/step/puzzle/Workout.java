package ua.step.puzzle;

/**
 * 
 * Куда делось переполненеи стэка из-за рекурсии?
 *
 */
public class Workout
{
    public static void main(String[] args)
    {
    	System.out.println("Время работать");
    	workHard();
        System.out.println("Время поспать");
    }

    private static void workHard()
    {
        try
        {
            workHard();
        }
        finally
        {
            workHard();
        }
    }
}
