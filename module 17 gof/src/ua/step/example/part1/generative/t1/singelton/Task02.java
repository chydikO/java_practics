package ua.step.example.part1.generative.t1.singelton;

import ua.step.example.part1.generative.t1.singelton.model.LazySingleton;

/**
 * 
 * Одиночка (англ. Singleton) — порождающий шаблон проектирования,
 * гарантирующий, что в однопроцессном приложении будет единственный экземпляр
 * некоторого класса, и предоставляющий глобальную точку доступа к этому
 * экземпляру.
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        LazySingleton lazySingelton1 = LazySingleton.getInstance();
        lazySingelton1.test();
    }
}