package ua.step.example.part1.gc;

/**
 * 
 * Порядок финализации
 *
 */
public class Task03
{
    public static void main(String[] args) throws InterruptedException
    {
        int i = 0;
        while (true)
        {
            new BigObject(++i);
            Thread.sleep(3);
        }
    }

    static class BigObject
    {
        private char[] tmp = new char[10000];
        private int i;

        public BigObject(int i)
        {
            this.i = i;
        }

        protected void finalize() throws Throwable
        {
            tmp[0] = 1;
            System.out.println("финализация " + i);
        }
    }
}
