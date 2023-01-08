package ua.step.example.part3.strings;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * 
 * Чтение строк из файла
 *
 */
public class Task02
{

    public static void main(String[] args) throws IOException
    {
        FileReader reader = new FileReader(Task01.FILE_NAME);
        LineNumberReader fileReader = new LineNumberReader(reader);
        String str;
        while ((str = fileReader.readLine()) != null)
        {
            System.out.printf("%d %s %n", fileReader.getLineNumber(), str);
        }
        fileReader.close();
    }
}
