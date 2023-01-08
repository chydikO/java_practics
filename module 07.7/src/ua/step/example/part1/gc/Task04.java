package ua.step.example.part1.gc;

public class Task04
{
    public static void main(String[] args) throws InterruptedException
    {
        int i = 0;
        new LongFinalize();
        while (true)
        {
            new BigObject();
            Thread.sleep(10);
            if (i++ % 100 == 0)
            {
                System.out.println("Всего: " + Runtime.getRuntime().totalMemory() + "; свободно: "
                        + Runtime.getRuntime().freeMemory());
            }
            if (Runtime.getRuntime().freeMemory() < 1e6)
                System.runFinalization();
        }
    }

    static class LongFinalize
    {
        protected void finalize() throws Throwable
        {
            System.out.println("начало длительной финализации");
            Thread.sleep(10000);
            System.out.println("конец длиетльной финализации");
        }
    }

    static class BigObject
    {
        static int count;
        char[] tmp = new char[10000];

        BigObject()
        {
            count++;
        }

        protected void finalize() throws Throwable
        {
            tmp[0] = 1;
            System.out.println("короткая финализация " + count--);
        }
    }
}