package ua.step.example.part1.generative.t1.singelton.model;

/**
 * + Ленивая инициализация 
 * - Низкая производительность (критическая секция) в  наиболее типичном доступе
 * 
 */
public class LazySingleton
{
    private static LazySingleton instance;

    private LazySingleton()
    {
    	// обязательно приватный конструктор
    }

    /**
     * метод получения объекта сингелтона
     */
    public static synchronized LazySingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void test()
    {
        System.out.println("Это Сингелтон с ленивой инициализацией");
    }
}
