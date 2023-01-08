package ua.step.example.part2.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import ua.step.example.part1.file.system.Task01;

/**
 * 
 * Чтения байтов из файла
 *
 */
public class Task02
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(Task01.FILE_NAME);
        if (file.exists())
        {
            InputStream fis = new FileInputStream(file);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            fis.close();
            System.out.println(new String(bytes));
        }
        else
        {
            System.out.printf("File %s not found", Task01.FILE_NAME);
        }
    }
}