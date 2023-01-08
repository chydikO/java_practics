package ua.step.puzzle;

/**
 * Замени RuntimeException на IOException; 
 *
 */
public class Arcane1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Hello world");
        }
        catch (RuntimeException e)
        {
            System.out.println("I've never seen println fail!");
        }
    }
}
