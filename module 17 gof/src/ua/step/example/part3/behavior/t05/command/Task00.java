package ua.step.example.part3.behavior.t05.command;

public class Task00
{
    public static void main(String[] args)
    {
        Light l = new Light();
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);

        Switch switch1 = new Switch(switchUp, switchDown);

        switch1.flipUp();
        switch1.flipDown();
    }
}

interface Command
{
    void execute();
}

class Switch
{
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand)
    {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    public void flipUp()
    {
        flipUpCommand.execute();
    }

    public void flipDown()
    {
        flipDownCommand.execute();
    }
}

class Light
{
    public void turnOn()
    {
        System.out.println("The light is on");
    }

    public void turnOff()
    {
        System.out.println("The light is off");
    }
}

class TurnOnLightCommand implements Command
{
    private Light theLight;

    public TurnOnLightCommand(Light light)
    {
        this.theLight = light;
    }

    public void execute()
    {
        theLight.turnOn();
    }
}

class TurnOffLightCommand implements Command
{
    private Light theLight;

    public TurnOffLightCommand(Light light)
    {
        this.theLight = light;
    }

    public void execute()
    {
        theLight.turnOff();
    }
}
