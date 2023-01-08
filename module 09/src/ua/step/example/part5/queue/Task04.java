package ua.step.example.part5.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * Двухстороняя очередь
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for (int i = 0; i < 10; i++)
        {
            //deque.add(i);
            deque.addFirst(i);
            deque.addLast(i);
        }
        System.out.println(deque);
        while(!deque.isEmpty())
        {
            int value1 = deque.pollFirst();
            int value2 = deque.pollLast();
            System.out.println(value1 +" "+ value2);
            System.out.println(deque);
        }
    }
}
