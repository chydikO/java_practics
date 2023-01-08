package ua.step.example.part2.structural.t6.decorator;

public class Task00
{
    public static void main(String[] args)
    {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); 
        c.newOperation();
    }
}

interface InterfaceComponent
{
    void doOperation();
}

class MainComponent implements InterfaceComponent
{

    @Override
    public void doOperation()
    {
        System.out.print("World!");
    }
}

abstract class Decorator implements InterfaceComponent
{
    protected InterfaceComponent component;

    public Decorator(InterfaceComponent component)
    {
        this.component = component;
    }

    @Override
    public void doOperation()
    {
        component.doOperation();
    }

    public void newOperation()
    {
        System.out.println("Do Nothing");
    }
}

class DecoratorSpace extends Decorator
{

    public DecoratorSpace(InterfaceComponent component)
    {
        super(component);
    }

    @Override
    public void doOperation()
    {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation()
    {
        System.out.println("New space operation");
    }
}

class DecoratorComma extends Decorator
{
    public DecoratorComma(InterfaceComponent component)
    {
        super(component);
    }

    @Override
    public void doOperation()
    {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation()
    {
        System.out.println("New comma operation");
    }
}

class DecoratorHello extends Decorator
{
    public DecoratorHello(InterfaceComponent component)
    {
        super(component);
    }

    @Override
    public void doOperation()
    {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation()
    {
        System.out.println("New hello operation");
    }
}