package ua.step.example.part0.wrapper;

/**
 * 
 * Преобразование типов с помощью классов оберток. 
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
    	Number n = 3.6;
    	System.out.println(n.intValue());
    	//Float f = (Float) n; // так нельзя
    	Float f = n.floatValue(); // так можно
    	System.out.println(f);
    }
}
