package ua.step.example.part4.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Интерфейс Map реализует ассоциотивный массив
 * HashMap реализация интерфейса Map на основе хэширования.  
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("Иванов", "Иван"); // добавляет пару ключ значения в мап
        System.out.println(maps);

        maps.put(null, "Аноним"); //разрешено добавлять в качестве ключа null
        //System.out.println(maps);

        String name = maps.get("Иванов"); // получение значения по ключу
        //System.out.println(name);
        name = maps.get(1);
        //System.out.println(name);
        name = maps.get("Иванов");
        //System.out.println(name);
        name = maps.get(null);
        //System.out.println(name);
    }
}
