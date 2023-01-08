package ua.step.example.part4.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Обертки для Map 
 *
 */
public class Task09
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("test", "test");
        
        // не модифицируемый
        Map<String, String> uMap = Collections.unmodifiableMap(map); 
        uMap.put("test1", "test");

        // Одиночный 
        Map<String, Integer> sMap = Collections.singletonMap("t", 1); 
        sMap.put("test", 2);
        
        // Синхронизированный map
        Map<String, String> synMap = Collections.synchronizedMap(map); // Thread-self обертка
    }
}
