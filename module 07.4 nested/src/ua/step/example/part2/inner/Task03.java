package ua.step.example.part2.inner;


public class Task03
{
    public static void main(String[] args)
    {
        OuterClass3 outerClass3 = new OuterClass3();
        System.out.println(outerClass3.getX());
        OuterClass3.Inner inner = outerClass3.new Inner();
        inner.x(4);
        System.out.println(outerClass3.getX());

    }
}

/**
 * Обрамляющий класс
 */
class OuterClass3
{
    // переменная обрамляющего класса
    private int x;

    public int getX()
    {
        return x;
    }
    /**
     * внутренний класс
     */
    class Inner
    {
        // переменная внутреннего класса
        private int x;

        public void x(int x)
        {
            x = 1;
            this.x = 2;
            OuterClass3.this.x = 3;
        }

        public int getX()
        {
            return x;
        }
        //нельзя объявлять статические методы и переменные
        //public static void test(){}
        
        // внутренний класс в Inner
        class Inner2
        {
            int x;

            public void getX(int x)
            {
                OuterClass3.Inner.this.x = 5;
            }
        }
    }
}