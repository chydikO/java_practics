package ua.step.example.part2.encapsulation.model;

public class Car
{
    private boolean key;

    /**
     * открытый интерфейс класса. В машину можно вставить ключ.
     */
    public void setKey()
    {
        this.key = true;
    }

    /**
     *  открытый интерфейс класса. Машина может ехать
     */
    public void drive()
    {
        // реализация интерфейса
        if (isKey())
        {
            ignition();
            fuelSupply();
            System.out.println("Поехали");
        }
        else
        {
            System.out.println("Вставьте ключ зажигания");
        }
    }

    /**
     * реализация
     */
    private void fuelSupply()
    {
        System.out.println("Подача топлива");
    }

    /**
     * реализация
     */
    private void ignition()
    {
        System.out.println("Включение зажигания");
    }

    /**
     * реализация
     */
    private boolean isKey()
    {
        return key;
    }
}
