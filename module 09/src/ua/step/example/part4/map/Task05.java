package ua.step.example.part4.map;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

import ua.step.example.part4.map.model.HashPerson;

/**
 * 
 * Ассациотивный массив с отсортированными ключами
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        AbstractMap<String, Integer> maps = new TreeMap<String, Integer>();
        //AbstractMap<String, Integer> maps3 = new AbstractMap<String, Integer>();
        
        maps.put("Сидоров", 1);
        maps.put("Иванов", 2);
        maps.put("Петров", 3);
        maps.put("Алавердыев", 4);

        System.out.println(maps);
        Map<HashPerson, Integer> mapPesons = new TreeMap<HashPerson, Integer>();
        HashPerson person = new HashPerson("Алабаев", "Константин");
        mapPesons.put(person, 1);
        person = new HashPerson("Иванов", "Иван");
        mapPesons.put(person, 2);
        // FIXME реализуй интерфейс Comporable в классе HashPerson
    }
}
