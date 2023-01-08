package ua.step.example.part3.constructor;

/**
 * 
 * Инициализация финальным методом
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        FinalInitialazer m = new FinalInitialazer();
        System.out.println(m.getFinalData());
    }
}

class FinalInitialazer
{
    // инициализация с помошью не финального метода
    private String finalData = getData();

    public final String getData()
    {
        return "final data";
    }

    public String getFinalData()
    {
        return finalData;
    }
}