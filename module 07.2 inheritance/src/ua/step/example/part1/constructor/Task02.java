package ua.step.example.part1.constructor;

/**
 * 
 * Конструкторы и наследование. 
 * 
 */
public class Task02
{
    public static void main(String[] args)
    {
        new ChieldClass();
    }
}

class SuperClass
{
    SuperClass()
    {
        System.out.println("super empty");
    }

    SuperClass(int i)
    {
        System.out.println("super int");
    }
}

class ChieldClass extends SuperClass
{
    ChieldClass()
    {
        //super(1);  // вызов конструктора суперкласса     
    	System.out.println("sub empty");
    }
}