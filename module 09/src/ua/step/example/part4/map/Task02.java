package ua.step.example.part4.map;

import java.util.HashMap;
import java.util.Map;

import ua.step.example.part4.map.model.HashPerson;

/**
 * 
 * Ассоциативный массив на основе таблицы хэширования 
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Map<HashPerson, String> persons = new HashMap<HashPerson, String>();
        HashPerson person = new HashPerson("Петров", "Петр");
        persons.put(person, "Программист");
        String jobName = persons.get(person);
        System.out.println(jobName);
        HashPerson person2 = new HashPerson("Петров", "Петр");
        jobName = persons.get(person2); // будте внимательны метод не типизирован
        System.out.println(jobName);
      //FIXME перегрузить методы hashCode и equals в классе HashPerson после указания преподователя
    }
}
