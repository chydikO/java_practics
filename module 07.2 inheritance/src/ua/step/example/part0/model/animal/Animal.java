package ua.step.example.part0.model.animal;

public class Animal
{
    private boolean hungry = true;

    public void eat()
    {
        hungry = false;
    }

    public void sleep()
    {
        hungry = true;
    }

    public boolean isHungry()
    {
        return hungry;
    }

    public String sound()
    {
        return "Я животное";
    }
}