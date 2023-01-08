package ua.step.homework;

import java.io.IOException;

/**
 * Пользовталь вводит с клавиатуры букву, программа должна определить, в какой
 * раскладке введена буква, в латинской или кирилице. Вывести в консоль:
 * «латиница» если буква введена латиницей, и «кирилица» если буква относится к
 * кирилическому алфавиту. Если введена цифра а не буква, вывести «цифра». Если
 * символ не относится ни к буквам ни к цифрам вывести «невозможно определить».
 * Программа не долджна зависеть от регистра букв. Подсказка: Символы в таблице
 * UNICODE распологаюся в алфавитном порядке.
 * 
 * 
 */
public class Task07
{
    public static void main(String[] args) throws IOException
    {
        char letter = (char) System.in.read();
        System.out.println(letter);
    }
}