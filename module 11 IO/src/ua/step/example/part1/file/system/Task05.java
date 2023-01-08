package ua.step.example.part1.file.system;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * Работа с файловой системой. Использование файлового фильтра.
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        File file = new File("c:");

        // создание фильтра c использованием лямбда выражений
        FileFilter filter = f -> f.getName().endsWith(".txt") || f.isDirectory();
        File[] files = file.listFiles(filter);
        printFiles(files, filter);
    }

    // FIXME переделать метод таким образом, чтобы он выводил все файлы с
    // расширеннием txt на диске или в указанной дерикториию 
    private static void printFiles(File[] files, FileFilter filter)
    {
        for (File file : files)
        {
            if (file.isDirectory()) 
            {
                System.out.println("DIR " + file.getAbsolutePath());
            }
            else
            {
                System.out.println("FILE " + file.getName());
            }
        }
    }
}
