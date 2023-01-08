package ua.step.example.part4.anonymous;

/**
 * 
 * Анонимные классы при объявлении не используют ключевое слово class
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        // создание объекта на основе анонимного класса
        Runnable t = new Runnable()
        {
            @Override
            public void start()
            {
                System.out.println("I anonymous");
            }
        }; // точка с запятой обязательна, так как обявление анонимного класса
           // считается одним выражением
        
        t.start(); // вызов метода который реализован в анонимном классе
    }
}

interface Runnable
{
    public void start();
}