package ua.step.example.part1.file.system;

import java.io.File;
import java.io.IOException;

/**
 * 
 * Создание нового файла
 *
 */
public class Task01
{
    public static final String FILE_NAME = "byte_test.txt";

    public static void main(String[] args)
    {
        File file = new File(FILE_NAME);
        if (file.exists())
        {
            System.out.println("Файл уже существует");
            // удаление файла
            file.delete();
        }
        try
        {
            if (file.createNewFile()) // создание файла
            {
                System.out.println("Файл " + file.getName() + " создан в " + file.getAbsolutePath());
            }
            else
            {
                System.out.println("Не возможно создать файл.");
            }
            // установка атрибута файла (только для чтения)
            file.setWritable(false);
            // FIXME заккоментируй строку выше, так как нельзя будет писать в
            // файл с атрибутом торлько для чтения
            file.setLastModified(System.currentTimeMillis());
        }
        catch (IOException e)
        {
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}