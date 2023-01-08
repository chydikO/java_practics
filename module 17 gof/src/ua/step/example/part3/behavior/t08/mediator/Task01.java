package ua.step.example.part3.behavior.t08.mediator;

import java.util.ArrayList;
import java.util.List;

public class Task01
{
    public static void main(String[] args)
    {
        Dispatcher dispatcher = new AirportDispatcher();
        Airceaft airceaft1 = new AirceaftImpl("БОИНГ 147", dispatcher);
        Airceaft airceaft2 = new AirceaftImpl("ТУ 154", dispatcher);
        Airceaft airceaft3 = new AirceaftImpl("МИГ 21", dispatcher);
        
        airceaft1.send("Прошу разрешения на посадку");
        airceaft2.send("Прошу разрешения на посадку");
        
        airceaft1.send("Борт сел");
        airceaft2.send("Прошу разрешения на посадку");
        
        dispatcher.send("Всем бортам. Сильный туман. Аэропорт закрыт для посадки");
        
        airceaft3.send("Прошу разрешения на посадку");
    }
}

interface Dispatcher
{
    public abstract void send(String message, Airceaft airceaft);

    public abstract void send(String message);

    public void registration(Airceaft airceaft);
}

class AirportDispatcher implements Dispatcher
{
    private boolean runway = true;
    private List<Airceaft> airceafts = new ArrayList<>();

    public void send(String message, Airceaft airceaft)
    {
        System.out.printf("Диспетчер принял сообщение:%s от борта %s%n", message, airceaft.name);
        switch(message) {
            case "Прошу разрешения на посадку":
            {
                if (runway) {
                    airceaft.read("Посадку разрешаю");
                    runway = false;
                }
                else {
                    airceaft.read("Полоса занята, зайдите на второй круг");
                }
                break;
            }
            case "Борт сел":
                airceaft.read("Направляйтесь на стоянку");
                runway = true;
                break;
        }
    }

    @Override
    public void send(String message)
    {
        for (Airceaft airceaft : airceafts)
        {
            airceaft.read(message);
        }
        if ("Всем бортам. Сильный туман. Аэропорт закрыт для посадки".equals(message)) {
            runway = false;
        }
        else {
            runway = true;
        }
    }

    @Override
    public void registration(Airceaft airceaft)
    {
        airceafts.add(airceaft);
    }
}

abstract class Airceaft
{
    protected String name;
    private Dispatcher dispatcher;

    public Airceaft(String name, Dispatcher dispatcher)
    {
        this.name = name;
        this.dispatcher = dispatcher;
        dispatcher.registration(this);
    }

    void read(String message)
    {
        System.out.printf("Борт %s принял сообщение: %s%n", name, message);
    }

    void send(String message)
    {
        dispatcher.send(message, this);
    }
}

class AirceaftImpl extends Airceaft
{
    public AirceaftImpl(String name, Dispatcher dispatcher)
    {
        super(name, dispatcher);
    }
}