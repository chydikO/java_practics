package ua.step.example;

/**
 * 
 * Выбрасывание исключительных ситуаций в коде командой throw
 *
 */
public class Task06
{
    public static void main(String[] args)
    {

        throw new NullPointerException("Таки null"); 
        //throw new String(“Ошибка”);         // разкомментируй меня
        //throw new null;
    }
}
