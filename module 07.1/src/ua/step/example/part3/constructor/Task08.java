package ua.step.example.part3.constructor;

/**
 * 
 * Подсчет количества созданных объектов используя конструктор и статическую
 * переменную класса.
 *
 */
public class Task08
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            InstanceCounter task = new InstanceCounter();
            System.out.println(task.getNonStaticCount());
        }
        System.out.printf("all instace %d ", InstanceCounter.getCount());
    }
}

class InstanceCounter
{
    // счетчик создаваемых объектов
    private static int count;

    public InstanceCounter()
    {
        // увеличение счетчик при создании объекта класса 
        count++;
    }

    public static int getCount()
    {
        return count;
    }
    
    public int getNonStaticCount()
    {
        return count;
    }
}