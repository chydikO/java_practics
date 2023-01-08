package ua.step.example.part4.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Ассациотивный массив с упорядоченным хранением ключей.
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        // FIXME замени  HashMap на LinkedHashMap 

        Map<String, Integer> maps = new HashMap<String, Integer>();

        for (int i = 1; i < 11; i++)
        {
            maps.put(String.valueOf(getString(i)), i);
        }
        System.out.println(maps);
    }

    private static char[] getString(int n)
    {
        char[] chars = new char[n];
        for (char c = 'A', i = 0; i < n; i++, c++)
        {
            chars[i] = c;
        }
        return chars;
    }
}
