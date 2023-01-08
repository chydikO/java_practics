package ua.step.example.part5.others;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * Конструкция try-with-resources появилась в java 7
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        try (FileInputStream fin = new FileInputStream(ua.step.example.part1.file.system.Task01.FILE_NAME))
        {
            int i = -1;
            while ((i = fin.read()) != -1)
            {

                System.out.print((char) i);
            }
        }
        catch (IOException ex)
        {

            System.out.println(ex.getMessage());
        }
    }
}