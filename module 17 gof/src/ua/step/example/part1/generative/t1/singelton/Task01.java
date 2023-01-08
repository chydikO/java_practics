package ua.step.example.part1.generative.t1.singelton;

import ua.step.example.part1.generative.t1.singelton.model.SimpleSingleton;

/**
 * 
 * Одиночка (англ. Singleton) — порождающий шаблон проектирования,
 * гарантирующий, что в однопроцессном приложении будет единственный экземпляр
 * некоторого класса, и предоставляющий глобальную точку доступа к этому
 * экземпляру.
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        SimpleSingleton singelton = SimpleSingleton.INSTANCE;
        // нельзя создать объект класса через new
        // new SimpleSingleton();
        singelton.test();
    }
}