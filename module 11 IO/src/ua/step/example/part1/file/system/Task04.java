package ua.step.example.part1.file.system;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * Работа с файловой системой.
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        File file = new File("c:");
        File[] files = file.listFiles();
        printFiles(files);
    }

    // FIXME переделать метод таким образом, чтобы он выводил все дериктории и
    // файлы с указанного диска или дериктории. Добавить отступы для вложенных
    // файлов и дерикторий.
    // Подсказка 1: Используй рекурсию.
    // Подсказка 2: Метод  listFiles возвращает null для пустой дериктории
    private static void printFiles(File[] files)
    {
        for (File file : files)
        {
            if (file.isDirectory()) // проверка является ли файл дерикторией
            {
                System.out.println("DIR: " + file.getName());
            }
            else
            {
                System.out.println("FILE: " + file.getName());
            }
        }
    }
}
