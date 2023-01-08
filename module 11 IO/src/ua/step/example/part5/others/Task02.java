package ua.step.example.part5.others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Создание бэкапа файла
 * 
 * URI — символьная строка, позволяющая идентифицировать какой-либо ресурс:
 * документ, изображение, файл, службу, ящик электронной почты и т. д.
 * 
 */
public class Task02
{
    private static final String SOURCE = "test.txt";
    private static final String COPY = "test.bak";

    public static void main(String[] args)
    {
        try (BufferedReader inputReader = Files.newBufferedReader(Paths.get(new URI(SOURCE)),
                Charset.defaultCharset());
                BufferedWriter outputWriter = Files.newBufferedWriter(Paths.get(new URI(COPY)),
                        Charset.defaultCharset()))
        {

            String inputLine;
            while ((inputLine = inputReader.readLine()) != null)
            {
                outputWriter.write(inputLine);
                outputWriter.newLine();
            }
            System.out.println("Copy complete!");
        }
        catch (URISyntaxException | IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
