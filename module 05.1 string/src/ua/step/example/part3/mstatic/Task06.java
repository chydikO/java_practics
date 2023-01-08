package ua.step.example.part3.mstatic;

import java.util.Locale;

/**
 * 
 * Форматирование данных в строке
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        System.out.println("\nЛокализация");
        System.out.printf(Locale.ENGLISH, "%,d%n", 1000000);// 1,000,000
        System.out.printf(Locale.GERMAN, "%,d%n", 1000000); // 1.000.000
        System.out.printf(Locale.FRANCE, "%,d%n", 1000000); // 1

        String s = String.format("Курс валют: %-4s%-8.4f  %-4s%-8.4f", "USD", 58.4643, "EUR", 63.3695);
        System.out.println(s);
    }
}