package ua.step.example.part5.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * 
 * Очередь с приоритетом
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++)
        {
            queue.add(rnd.nextInt(100));
        }
        System.out.println(queue);
        
        // пока очередь не пуста
        while(!queue.isEmpty())
        {
            Integer element = queue.remove();
            System.out.print(queue);
            System.out.println(" remove " + element);
        }
        
        for (int i = 0; i < 10; i++)
        {
            boolean offer = queue.offer(rnd.nextInt(3));
            System.out.println(offer);
        }
        System.out.println(queue);
    }
}
