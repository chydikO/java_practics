package ua.step.example.part3.constructor;

/**
 * Инициализация полей в месте объявления.
 * 
 */
public class Task01
{
    public static void main(String[] args)
    {
        System.out.println(Static.getStaticData());
        Static model = new Static();

        System.out.println(model.getData());
        // не правильное использованеи статического метода
        System.out.println(model.getStaticData());

        // правильное использование статического метода
        System.out.println(Static.getStaticData());
    }
}

class Static
{
    // статическое поле класса
    private static String staticData = "static data";

    // не статическое поле класса
    private String data = "data";

    public String getData()
    {
        return data;
    }

    public static String getStaticData()
    {
        return staticData;
    }
}