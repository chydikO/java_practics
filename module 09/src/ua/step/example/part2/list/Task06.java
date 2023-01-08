package ua.step.example.part2.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 
 * foreach и iterator
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        int n = 16;
        List<Integer> list = new ArrayList<Integer>(n);
        Random rnd = new Random();
        for (int i =0; i< n; i++)
        {
            list.add(rnd.nextInt(n));
        }
        
        for (Integer element: list)
        {
            System.out.print(element + " ");
            //list.add(1);
            //list.remove(1);
        }
        System.out.println();
        
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
        	System.out.print(iterator.next()+ " ");
        	//iterator.remove(); // удаляет элемент на который указывает итератор
        }
        
        LinkedList<Integer> ll = new LinkedList<Integer>();
    }
}
