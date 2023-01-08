package ua.step.example.part1.generative.t1.singelton.model;

/**
 * + Остроумно 
 * + Сериализация из коробки 
 * + Потокобезопасность из коробки 
 * + Возможность использования EnumSet, EnumMap и т.д. 
 * + Поддержка switch 
 * - Не ленивая инициализация
 * 
 * @author VUnguryan
 * 
 */
public enum EnumSingleton
{
    INSTANCE;

    public void test()
    {
        System.out.println("It's enum singleton");

    }
}
