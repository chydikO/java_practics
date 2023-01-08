package ua.step.example.part6.old;

import java.util.Vector;

/**
 * 
 * Vector - устаревший аналог ArrayList
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        Vector<Integer> vectors = new Vector<Integer>();
        for (int i = 0; i < 10; i++)
        {
            vectors.add(i);
        }
        System.out.println(vectors);
        //FIXME сравни по по скорости добавления с ArrayList
    }
}
