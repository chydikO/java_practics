package ua.step.example.part1.constructor;

/**
 * 
 * Порядок вызова инициализации переменных и конструторов при наследовании
 *
 */
public class Task01
{

    public static void main(String[] args)
    {
        Super b = new Sub(7);
    }
}

class Super
{
    int s0 = initialize("инициализация поля суперкласса s0");

    int s1;
    {
        s1 = initialize("инициализация не статического блока суперкласса s1");
    }

    int s2 = initialize("инициализация поля суперкласса s2");

    int s3;

    Super()
    {
        s3 = initialize("инициализация в конструкторе супекласса s3");
    }

    static int initialize(String message)
    {
        System.out.println(message);
        return 1;
    }
}

class Sub extends Super
{
    int i4 = initialize("инициализация поля класса наследника i4");

    int i5;

    {
        i5 = initialize("инициализация в нестатическом блоке наследника i5");
    }

    int i6;

    int i7;

    Sub()
    {
        i6 = initialize("инициализация в конструкторе наследника i6");
    }

    public Sub(int i)
    {
        i7 = i;
        initialize("инициализация в конструкторе наследника i7");
    }
}
