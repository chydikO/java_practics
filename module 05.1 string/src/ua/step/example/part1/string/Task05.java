package ua.step.example.part1.string;

/**
 * Длина строки - метод length
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        String testString = "kitten";
        // вызов метода для переменной в которой хранится строка
        int lenght = testString.length();
        System.out.println(lenght);
        
        testString = "cat";
        lenght = testString.length();
        
        System.out.println(lenght);

        for (int i = 0; i < 1000; i++)
        {
            testString += i;
        }
        System.out.println(testString.length());
    }
}