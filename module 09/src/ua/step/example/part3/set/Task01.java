package ua.step.example.part3.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Добавление элементов в множество
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        Set<String> sets = new HashSet<String>();
        // метода add возвращает истину если объект был добавлен в множество
        boolean added = sets.add("abc"); 
        System.out.println(added); //
        
        // метода add возвращает ложь если объект не был добавлен в множество
        added = sets.add("abc");
        System.out.println(added);
        
        added = sets.add(new String("abc"));
        System.out.println(added);

        added = sets.add("ABC");
        System.out.println(added);
        System.out.println(sets);
    }
}
