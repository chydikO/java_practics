package ua.step.example.part2.bytes;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * DataOutputStream Выходной поток, включающий методы для записи стандартных
 * типов данных Java
 *
 */
public class Task03
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("data.out");
        if (file.exists())
        {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true));
            dos.writeShort(1);
            dos.writeInt(2);
            dos.writeLong(Long.MAX_VALUE);
            dos.writeChars("Hello world");
            dos.writeDouble(1.2);
            dos.close();
        }
        else
        {
            System.out.printf("File %s not found", file.getName());
        }
    }
}