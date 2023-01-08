package ua.step.example.part1.nested;

// вложенные классы
public class Task01
{
    public static void main(String[] args)
    {
        // можно создавать объекты вложенного класса 
        OuterClass.NestedClass innerClass = new OuterClass.NestedClass();
        innerClass.main();
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
        // можно создавать объекты вложенного класса в статических методах
        new NestedClass();
    }

    void outher()
    {
        i++;
        // можно создавать объекты вложенного класса в методах экземпляра
        new NestedClass();
    }

    /**
     * Вложенный класс
     */
    public static class NestedClass
    {
        int c;

        public void main()
        {
            i++;
            // j++;
            outherStatic();
            // outher2();
            System.out.println(i); // можно обращаться к статическим полям обрамляющего класа
            // System.out.println(k); // нельзя обращаться к нестатическим полям обрамляющего класа 
        }
    }
}