package ua.step.example.part0.reference;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 
 * Мягкие ссылки
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Set<Reference<Big>> setSoft = new HashSet<Reference<Big>>();
        for (int i = 0; i < 1000; i++)
        {
            Big big = new Big();
            Reference<Big> ref = new SoftReference<Big>(big);
            setSoft.add(ref);
        }

        Iterator<Reference<Big>> iterator = setSoft.iterator();
        while (iterator.hasNext())
        {
            Reference<Big> ref = iterator.next();
            Big big = ref.get();
            if (big == null)
            {
                System.out.println("null");
            }
        }
    }

    private static class Big
    {
        private List<Long> lists = new ArrayList<Long>();
        {
            Random rnd = new Random();
            for (int i = 0; i < 100000; i++)
            {
                lists.add(rnd.nextLong());
            }
        }

        @Override
        public String toString()
        {
            return lists.toString();
        }
    }
}