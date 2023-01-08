package ua.step.example.part0.nulls;

/**
 * Проверка значений ссылочных переменных на null
 */
public class Task03
{
    public static void main(String[] args)
    {
        String abc = null;
        String cde = null;
        if (abc == cde)
        {
            System.out.println("null == null is true in Java");
        }
        if (null != null)
        {
            System.out.println("null != null is true in Java");
        }
        // классическая проверка переменной на null
        if (null == abc)
        {
            // do something
        }
        
        // not ok, compile time error
        // if(abc > null){}
    }
}