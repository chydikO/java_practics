package ua.step.example;

/**
 * 
 * Пойманое исключени можно бросить еще раз.
 *
 */
public class Task14
{
    public static void main(String[] args)
    {
        try
        {
            String test = null;
            test = test.trim();
        }
        catch (NullPointerException npe)
        {
            System.err.println("Поймали NPE"); 
            throw npe; // и снова бросаем 
        }
        catch (ArithmeticException ae) {
            System.err.println(2);
        }
        System.err.println(3);
    }
}
