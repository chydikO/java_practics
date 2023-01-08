package ua.step.example.part3.strings;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * Символьные потоки
 *
 */
public class Task01
{
    public static final String FILE_NAME = "string_test.txt";

    public static void main(String[] args) throws IOException
    {
        FileWriter fileWriter = new FileWriter(FILE_NAME);
        Scanner scaner = null;
        try
        {
            String text;
            System.out.println("Для прекращения ввода введите пустую строку");
            do
            {
                scaner = new Scanner(System.in);
                System.out.println("Введите строку:");
                text = scaner.nextLine().trim();
                text += "\n";
                fileWriter.write(text);
            } while (!text.equals("\n"));
        }
        finally
        {
            fileWriter.close();
            scaner.close();
        }
    }
}