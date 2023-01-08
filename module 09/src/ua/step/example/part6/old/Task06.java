package ua.step.example.part6.old;

import java.util.Stack;

/**
 * 
 * Stack - устаревщий аналог очереди. 
 * Первый вошел последний вышел.
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 10; i++)
        {
            stack.push(i);
        }
        System.out.println(stack);
        int i = stack.pop(); // берется с конца
        System.out.println(i);
        System.out.println(stack);
    }
}
