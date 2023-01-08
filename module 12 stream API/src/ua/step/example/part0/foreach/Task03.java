package ua.step.example.part0.foreach;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * forEach для map
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "abb");
        map.put(5, "baa");
        map.put(17, "ccc");
        // метод forEach использует в качестве параметра BiConsumer (лямбда
        // выражение с двумя параметрами)
        map.forEach((k, v) -> System.out.printf("key = %d value = %s%n", k, v));
    }
}