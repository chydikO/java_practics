package ua.step.example.part3.constructor;

/**
 * 
 * Конструктор 
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        Constructor m = new Constructor("data2");
        System.out.println(m.getData());
    }
}

class Constructor
{
    private String data = "data";
    
    // не статичесий блок инициализации.
    {
        data = "data 1";
        System.out.println("non static block");
    }

    public Constructor(String data)
    {
        this.data = data;
        System.out.println("constructor");
    }

    public String getData()
    {
        return data;
    }
}