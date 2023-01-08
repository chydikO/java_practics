package ua.step.example.part5.others;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Чтение строк из текстового файла java 8 
 */
public class Task03
{
    public static void main(String[] args)
    {
        try (Stream<String> stream = Files.lines(Paths.get(ua.step.example.part3.strings.Task01.FILE_NAME)))
        {
            stream.forEach(System.out::println);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
