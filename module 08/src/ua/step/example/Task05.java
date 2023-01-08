package ua.step.example;

/*******************************************************************************
 * finally-секция может «перебить» throw/return при помощи другого throw/return
 * 
 * @author VUnguryan
 * 
 */
public class Task05
{
    public static void main(String[] args)
    {
        System.err.println(f());
        System.err.println(sqr(f()));
    }

    @SuppressWarnings("finally")
    public static int f()
    {
        try
        {
            return 0; // управление будет передано в блок finally
        }
        finally
        {
            return 1; // перебивает вызов return в finally секции
        }
    }

    public static double sqr(double arg)
    {
        if (System.currentTimeMillis() % 2 == 0)
        {
            return arg * arg;
        }
        // закоментируй меня
        return 0;
        // разкомментируй меня
        //throw new RuntimeException();
    }
}
