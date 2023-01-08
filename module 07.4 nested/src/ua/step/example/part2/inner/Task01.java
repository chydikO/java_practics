package ua.step.example.part2.inner;

import ua.step.example.part2.inner.OuterClass.InnerClass;

// Внутренние классы
public class Task01
{
    public static void main(String[] args)
    {
        // можно создавать объекты вложенного класса
        OuterClass outerClass = new OuterClass();
        InnerClass inner = outerClass.new InnerClass();
        inner.main();
    }
}

/**
 * Обрамляющий класс
 */
class OuterClass
{
    static int i;
    int j;
    final int k = 1;

    static void outherStatic()
    {
        i++;
        // c++;
        // Нельзя создавать в статических методах
        // new NestedClass();
    }

    void outher()
    {
        i++;
        // можно создавать объекты вложенного класса в методах экземпляра
        new InnerClass();
    }

    /**
     * Внутренний класс
     */
    public class InnerClass
    {
        int c;

        public void main()
        {
            i++;
            // j++;
            outherStatic(); //
            outher(); // можно вызывать методы экземпляра обрамляющего класса
            System.out.println(i);
            System.out.println(k);
        }
    }
}