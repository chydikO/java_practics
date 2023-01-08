package ua.step.example.part3.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Отсортированнное множество
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        Set<Character> treeSet = new TreeSet<Character>();
        Random rnd = new Random();
        for (int i = 0; i < 33; i++)
        {
            // добавляем cлучайные буквы
        	treeSet.add((char) ('А' + rnd.nextInt(32)));
            //System.out.println(treeSet);
        }
        // в результате имеем отсортированное множество
        System.out.println(treeSet);
    }
}
