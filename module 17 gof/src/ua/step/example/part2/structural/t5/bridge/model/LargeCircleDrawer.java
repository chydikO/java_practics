package ua.step.example.part2.structural.t5.bridge.model;

public class LargeCircleDrawer implements Drawer
{
    public static final int radiusMultiplier = 10;

    @Override
    public void drawCircle(int x, int y, int radius)
    {
        System.out.println("Large circle center = " + x + "," + y + 
                " radius = " + radius * radiusMultiplier);
    }
}
