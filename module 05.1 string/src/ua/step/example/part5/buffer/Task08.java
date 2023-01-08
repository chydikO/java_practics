package ua.step.example.part5.buffer;

/**
 * Сравнение объектов класса StringBuffer или StringBuildr
 */
public class Task08
{
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer("кошачий лоток");
        StringBuffer sb2 = new StringBuffer("кошачий лоток");
        System.out.println(sb1 == sb2);
        /// нельзя сравнивать два строковых буфера
        System.out.println(sb1.equals(sb2)); 
        // Правильный код по сравнению
        System.out.println(sb1.toString().equals(sb2.toString()));
    }
}
