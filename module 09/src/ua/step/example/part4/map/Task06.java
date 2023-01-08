package ua.step.example.part4.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

/**
 * Класс WeakHashMap использует для хранения ключей не строгие ссылки (weak
 * references). ОбъектWeakReference содержит ссылку на другой объект, т.е. в
 * данном случае на ключ хэш-таблицы. Обычно, если при сборке мусора выясняется,
 * что на некоторый объект нет ссылок, этот объект удаляется. А если
 * единственная ссылка на объект имеет тип WeakReference, эта нестрогая ссылка
 * помещается в очередь. Периодически происходит проверка на появление новых
 * ссылок в очереди, так как это означает, что данный ключ больше не
 * используется и его объект можно удалить.
 * 
 * @author VUnguryan
 * 
 */
public class Task06
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        // FIXME запустить и дождаться OutOfMemoryError: Java heap space
        // FIXME поменять HashMap на WeekHashMap и снова запустить
        Map<Integer, BigObject> maps = new HashMap<Integer, BigObject>();
        int i = 0;
        while (true)
        {
            i++;
            int key = rnd.nextInt();
            if (maps.containsKey(key))
            {
                System.out.println(i);
                i = 0;
            }

            maps.put(key, new BigObject());

        }
    }
    static class BigObject{
    	int [][][] mas = new int[100][100][100];
    }
}
