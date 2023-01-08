package ua.step.example.part0.wrapper;

/**
 * 
 * Методы Boolean. 
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        // преобразование строки в тип boolean
        boolean b1 = Boolean.parseBoolean("TRUE");
        System.out.println(b1);
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("TrUe"));
        System.out.println(Boolean.parseBoolean("1"));
        System.out.println(Boolean.parseBoolean("FALSE"));
        System.out.println(Boolean.parseBoolean("/TRUE"));
        Boolean b2 = Boolean.valueOf("true");
        System.out.println("== " + (b1==b2));
        Boolean b3 = Boolean.valueOf("true");
        System.out.println("== " + (b2==b3));
        Boolean b4 = new Boolean(true);
        System.out.println("== " + (b3==b4));
    }
}
