package ua.step.example.part4.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Получение набора ключей, списка значений и пар ключ-значение из мап
 */
public class Task04
{
    public static void main(String[] args)
    {
        Map<String, Integer> maps = new HashMap<String, Integer>();

        for (int i = 1; i < 22; i++)
        {
            maps.put(String.valueOf(getString(i)), i);
        }
        System.out.println(maps.keySet()); 
        //System.out.println(maps.values());

        Set<Entry<String, Integer>> entries = maps.entrySet();
        for (Entry<String, Integer> entry: entries)
        {
            System.out.printf("key = %s, value = %d\n", entry.getKey(), entry.getValue());
        }
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
