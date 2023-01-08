package ua.step.example.part2.structural.t5.bridge.model;

public abstract class Shape
{
    protected Drawer drawer;

    protected Shape(Drawer drawer)
    {
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);
}
