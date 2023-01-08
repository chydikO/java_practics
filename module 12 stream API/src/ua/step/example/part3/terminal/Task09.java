package ua.step.example.part3.terminal;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Коллекторы. Преобразование в коллекцию определенного типа 
 *
 */
public class Task09
{
    public static void main(String[] args)
    {
        Stream<String> phones = Stream.of(
                "iPhone 8",
                "HTC U12",
                "Huawei Nexus 6P",
                "Samsung Galaxy S9",
                "LG G6",
                "Xiaomi MI6",
                "ASUS Zenfone 2", 
                "Sony Xperia Z5",
                "Meizu Pro 6",
                "Lenovo S850");
          
        TreeSet<String> filteredPhones = phones
                .filter(s -> s.length() < 12)
                .collect(Collectors.toCollection(TreeSet::new));

        filteredPhones.forEach(s->System.out.println(s));
    }
}