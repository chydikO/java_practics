package ua.step.example.part6.tokenizwe;
import java.util.StringTokenizer;

/**
 * 
 * Разбиение строки на слова (или токены)
 * 
 */
public class Task01
{
    public static void main(String[] args)
    {
        String s = "Я люблю играть с котом";
        // разбивает строку на токены (части) используя в качестве разделителя пробел 
        StringTokenizer st = new StringTokenizer(s); 
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}