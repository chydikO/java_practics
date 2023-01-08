package ua.step.example.part2.bytes;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 * ByteArrayOutputStream класс для тех случаев, когда в качестве источника
 * применяется массив типа byte.
 *
 */
public class Task04
{
    public static void main(String[] args) throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(12);
        System.out.println("Enter 10 characters and a return");
        while (baos.size() != 10)
        {
            baos.write(System.in.read());
        }
        System.out.println("Buffer as a string");
        System.out.println(baos.toString());
        System.out.println("Into array");
        byte b[] = baos.toByteArray();
        for (int i = 0; i < b.length; i++)
        {
            System.out.print((char) b[i]);
        }
        System.out.println();
        System.out.println("To an OutputStream()");
        OutputStream f2 = new FileOutputStream("test.txt");
        baos.writeTo(f2);
        System.out.println("Doing a reset");
        baos.reset();
        System.out.println("Enter 10 characters and a return");
        while (baos.size() != 10)
        {
            baos.write(System.in.read());
        }
        System.out.println("Done.");
    }
}