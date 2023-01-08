package ua.step.example.part0;

/**
 * Сокрытие статических методов при наследовании
 * @author VUnguryan
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        Parent p = new Chield();
        p.main();
        Chield с = new Chield();
        с.main();
    }
}

class Parent{
    public static void main()
    {
        System.out.println("parent");
    }
}

class Chield extends Parent
{
    public static void main()
    {
        System.out.println("chield");
    }
}