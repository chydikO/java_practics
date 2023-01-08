package ua.step.example.part5.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Очередь LIFO
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        int element = queue.remove(); // бросает исключение если очередь пустая
        //Integer element = queue.poll(); // возвращает null если очередь пустая
        //Integer element = queue.poll();

        System.out.println(element);
        
        for (int i = 1; i <= 10; i++)
        {
            queue.add(i);
        }

        System.out.println(queue);

        element = queue.element();
        System.out.println(queue);
        System.out.println(element);
        
        while(!queue.isEmpty())
        {
            element = queue.remove();
            System.out.println(queue);
            System.out.println(element);
        }
    }
}
