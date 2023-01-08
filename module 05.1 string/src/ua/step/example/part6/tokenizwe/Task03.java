package ua.step.example.part6.tokenizwe;

import java.util.StringTokenizer;

/**
 * 
 * Разбиение строки на слова (или токены)
 * 
 */
public class Task03
{
    public static void main(String[] args)
    {
        String s = "1/22/333/";
        // разделяет строку на лексемы  (части), разделители тоже возвращаются в виде токена
        boolean returnDelims = true;
        StringTokenizer st = new StringTokenizer(s, "/", returnDelims); 
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}