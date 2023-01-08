package ua.step.example;

/**
 * System.err - выводит сообщение сразу, не буфиризируя его
 */

public class Task11
{
    public static void main(String[] args)
    {
        //FIXME Запустите пример несколько раз
    	try
        {
            int a = 1;
            System.out.println("NO Errro");
            System.err.println("Error"); // опережает вывод через System.out
            System.out.println(a / 0);
            
        }
        catch (ArithmeticException e)
        {
            System.out
                    .println("Произошла недопустимая арифметическая операция");
        }

    }

}
