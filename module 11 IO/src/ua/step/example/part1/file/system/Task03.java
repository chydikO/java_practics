package ua.step.example.part1.file.system;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Работа с файловой системой. Получение информации по дискам системы.
 */
public class Task03
{
    public static void main(String[] args) throws Exception
    {
        Path path = FileSystems.getDefault().getPath(Task01.FILE_NAME);
        displayFileAttributes(path);
    }

    private static void displayFileAttributes(Path path) throws Exception
    {
        // список дисков в файловой системе
        File[] roots = File.listRoots();

        System.out.println();
        System.out.println("System disk info:");
        for (int i = 0; i < roots.length; i++)
        {
            System.out.println(roots[i]);
            // свободное место в байтах
            System.out.printf("Free space = %,d bytes%n", roots[i].getFreeSpace());
            // используемое пространство
            System.out.printf("Usable space = %,d bytes%n", roots[i].getUsableSpace());
            // общий объем
            System.out.printf("Total space = %,d bytes%n", roots[i].getTotalSpace());
            System.out.println();
        }
    }
}