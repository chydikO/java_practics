package ua.step.homework;

import java.util.Scanner;

/**
 * Ввести строку с клавиатуры. Из введённой строки выбрать все слова
 * начинающиеся на гласные буквы и заканчивающиеся на согласные. Вывести
 * отобранные слова на консоль. 
 * Пример: 
 * Входные данные: Abc aaa caa ead 
 * Результат: Abc ead
 * 
 */
public class Task04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
    }
}
