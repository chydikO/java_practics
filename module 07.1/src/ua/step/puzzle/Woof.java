package ua.step.puzzle;

public class Woof
{
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Dog nipepr = new Basenji();
        dog.bark();
        nipepr.bark();
    }
}

class Dog
{
    public static void bark()
    {
        System.out.print("woof ");
    }
}

class Basenji extends Dog
{
    public static void name()
    {
    }
}