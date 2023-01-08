package ua.step.example.part2.structural.t4.proxy;

/**
 * Заместитель (англ. Proxy) — структурный шаблон проектирования, который
 * предоставляет объект, который контролирует доступ к другому объекту,
 * перехватывая все вызовы (выполняет функцию контейнера).
 */
public class Task00
{
    public static void main(String[] args)
    {
        IMath p = new MathProxy();

        // Do the math
        System.out.println("4 + 2 = " + p.add(4, 2));
        System.out.println("4 - 2 = " + p.sub(4, 2));
        System.out.println("4 * 2 = " + p.mul(4, 2));
        System.out.println("4 / 2 = " + p.div(4, 2));
    }
}

/**
 * "Subject"
 */
interface IMath
{
    public double add(double x, double y);
    public double sub(double x, double y);
    public double mul(double x, double y);
    public double div(double x, double y);
}

/**
 * "Real Subject"
 */
class Math implements IMath
{
    public double add(double x, double y)
    {
        return x + y;
    }

    public double sub(double x, double y)
    {
        return x - y;
    }

    public double mul(double x, double y)
    {
        return x * y;
    }

    public double div(double x, double y)
    {
        return x / y;
    }
}

/**
 * "Proxy Object"
 */
class MathProxy implements IMath
{
    private Math math;
    public double add(double x, double y)
    {
        if (math == null)
        {
            math = new Math();
        }
        return math.add(x, y);
    }

    public double sub(double x, double y)
    {
        if (math == null)
        {
            math = new Math();
        }
        return math.sub(x, y);
    }

    public double mul(double x, double y)
    {
        if (math == null)
        {
            math = new Math();
        }
        return math.mul(x, y);
    }

    public double div(double x, double y)
    {
        if (math == null)
        {
            math = new Math();
        }
        return math.div(x, y);
    }
}