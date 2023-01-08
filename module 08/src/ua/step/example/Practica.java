package ua.step.example;

public class Practica
{
    public static void main(String[] args)
    {
        System.out.println(area(10, 10));
        System.out.println(area(10, -1));
        System.out.println(area(-1, 10));
        System.out.println(area(-1, -1));
    }

    public static int area(int width, int height)
    {
        return width * height;
    }
}
