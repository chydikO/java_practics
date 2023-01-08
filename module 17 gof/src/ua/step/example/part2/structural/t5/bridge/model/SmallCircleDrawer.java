package ua.step.example.part2.structural.t5.bridge.model;

public class SmallCircleDrawer implements Drawer
{
    public static final double radiusMultiplier = 0.25;
    @Override
    public void drawCircle(int x, int y, int radius)
    {
        System.out.println("Small circle center = " + x + "," + y + 
                " radius = " + radius * radiusMultiplier);
    }
}