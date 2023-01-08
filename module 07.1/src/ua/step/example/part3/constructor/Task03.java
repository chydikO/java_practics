package ua.step.example.part3.constructor;

/**
 * 
 * Не статические блоки инициализации
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        System.out.println(NonStaticBlock.staticData);
        NonStaticBlock m = new NonStaticBlock();
        System.out.println(m.getData());
    }
}

class NonStaticBlock
{
    private String data = "data";

    public static int staticData = 1;

    // не статический блок инициализации 1
    {
        data = "data 1";
        System.out.println("non static block 1");
    }

    // не статический блок инициализации 2
    {
        data = "data 2";
        staticData = 2;
        System.out.println("non static block 2");
    }

    public String getData()
    {
        return data;
    }
}