package ua.step.example.part3.mstatic;

/**
 * 
 * Форматирование данных. Вывод таблицы. Псевдографика.
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        System.out.println("\nТаблица кусов валют");
        System.out.print("\u250c");
        for (int i = 0; i < 52; i++)
        {
            System.out.print("\u2500");    
        }
        System.out.print("\u2510\n");
        System.out.printf("\u2502%-5s%-11s%-25s%-11s\u2502%n", "Код", "За единиц", "Валюты", "Грн");
        System.out.print("\u251c");
        for (int i = 0; i < 52; i++)
        {
            System.out.print("\u2500");    
        }
        System.out.print("\u2524");
        System.out.println();
        String pattern = "\u2502%-5s%-11d%-25s%-11.4f\u2502%n";
        System.out.printf(pattern, "AUD", 1, "Австралийский доллар", 44.9883);
        System.out.printf(pattern, "GBP", 1, "Фунт стерлингов", 86.8429);
        System.out.printf(pattern, "BYR", 10000, "Белорусский рубль", 39.7716);
        System.out.printf(pattern, "DKK", 10, "Датская крона", 84.9192);
        System.out.printf(pattern, "USD", 1, "Доллар США", 28.564159);
        System.out.printf(pattern, "EUR", 1, "Евро", 32.3695);
        System.out.printf(pattern, "KZT", 100, "Казахский тенге", 31.4656544);
        System.out.print("\u2514");
        for (int i = 0; i < 52; i++)
        {
            System.out.print("\u2500");    
        }
        System.out.print("\u2518");
    }
}