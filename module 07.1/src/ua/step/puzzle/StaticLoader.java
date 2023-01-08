package ua.step.puzzle;

class Super
{
    static String ID = "QBANK";
}

class Sub extends Super
{
    static
    {
        System.out.print("In Sub");
    }
}

// FIXME Почему не запустился статический блок? Минимальными изменениями запусти
// статический блок
public class StaticLoader
{
    public static void main(String[] args)
    {
        System.out.println(Sub.ID);
    }
}