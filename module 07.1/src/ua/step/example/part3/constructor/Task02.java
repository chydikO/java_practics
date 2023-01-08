package ua.step.example.part3.constructor;

/**
 * 
 * Статические блоки инициализации - предназначены для инициализации
 * статического контекста.
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        StaticBlock m = new StaticBlock();
        System.out.println(m.getData());

        System.out.println(StaticBlock.staticData3);
    }
}

class StaticBlock
{
    private static String staticData = "data";

    private int nonStatic = 3;

    static
    {
        staticData = "static data 1";
        System.out.println("statick block 1");
        // нельзя в статических блоках обрашатся к нестатическим переменным экземпляра.
        // nonStatic = 1; 
    }
    
    // первый статический блок 
    static
    {
        staticData = "static data 2";
        System.out.println("statick block 2");
    }

    // второй статический блок
    static
    {
        staticData3 = "static data 3";
        System.out.println("statick block 3");
    }

    public static String staticData3 = "data3";

    public String getData()
    {
        return staticData;
    }
}
