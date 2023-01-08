package ua.step.example.part3.constructor;

/**
 * 
 * Копирующий конструктор
 *
 */
public class Task07
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        CopyConstructor model2 = new CopyConstructor(2, "cat");
        Model11 modelCopy = new Model11(model2);
    }
}

class CopyConstructor
{
    final int number;
    final String name;

    public CopyConstructor(int number, String name)
    {
        this.number = number;
        this.name = name;
    }
}

class Model11
{
    final int number;
    final String name;

    public Model11(CopyConstructor copy)
    {
        this.number = copy.number;
        this.name = copy.name;
    }

}