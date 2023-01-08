package ua.step.example.part3.behavior.t08.mediator;

/**
 * Посредник (англ. Mediator) — поведенческий шаблон проектирования,
 * обеспечивающий взаимодействие множества объектов, формируя при этом слабую
 * связанность и избавляя объекты от необходимости явно ссылаться друг на друга.
 */
public class Task00
{
    public static void main(String[] args)
    {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(c1);
        mediator.setColleague2(c2);

        c1.send("How are you?");
        c2.send("Fine, thanks");
    }
}

abstract class Mediator
{
    public abstract void send(String message, Colleague colleague);
}

class ConcreteMediator extends Mediator
{
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague)
    {
        this.colleague1 = colleague;
    }

    public void setColleague2(ConcreteColleague2 colleague)
    {
        this.colleague2 = colleague;
    }

    @Override
    public void send(String message, Colleague colleague)
    {
        if (colleague.equals(colleague2))
        {
            colleague1.notify(message);
        }
        else
        {
            colleague2.notify(message);
        }
    }
}

class ConcreteColleague1 extends Colleague
{
    public ConcreteColleague1(Mediator mediator)
    {
        super(mediator);
    }

    @Override
    public void notify(String message)
    {
        System.out.println("Colleague1 gets message: " + message);
    }
}

abstract class Colleague
{
    protected Mediator mediator;

    public Colleague(Mediator mediator)
    {
        this.mediator = mediator;
    }

    public void send(String message)
    {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}

class ConcreteColleague2 extends Colleague
{
    public ConcreteColleague2(Mediator mediator)
    {
        super(mediator);
    }

    @Override
    public void notify(String message)
    {
        System.out.println("Colleague2 gets message: " + message);
    }
}