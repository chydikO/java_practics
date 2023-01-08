package ua.step.example.part2.bytes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Запись байтов в файл.
 */
public class Task01
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(ua.step.example.part1.file.system.Task01.FILE_NAME);
        if (file.exists())
        {
            // запись в файл с перезаписью
            OutputStream fos = new FileOutputStream(file);
            // запись в файл с добавлением в конец
            // OutputStream fos = new FileOutputStream(file, true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String text = scanner.nextLine();

            // преобразование строки в массив байт
            byte[] data = text.getBytes();
            fos.write(data);
            fos.close();
            scanner.close();
        }
        else
        {
            System.out.println("Запустите ua.step.example.part1.file.system.Task01");
        }
    }
}