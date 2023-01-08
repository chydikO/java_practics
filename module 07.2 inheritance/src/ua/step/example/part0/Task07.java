package ua.step.example.part0;

/**
 * 
 * Ключевое слово super
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
    	Super9 m = new Sub9();
    	Super9 m1 = new Sub9(1);
    }
}

class Sub9 extends Super9
{
    Sub9()
    {
        //super();
        this(1);
    }

    Sub9(int i)
    {
        super();
        //super(i);
    }
}
class Super9
{
    Super9()
    {
    	System.out.println("Empty");
    }

    Super9(int i)
    {
       	System.out.println(i);
    }
}