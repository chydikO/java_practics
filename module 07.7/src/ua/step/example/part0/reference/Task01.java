package ua.step.example.part0.reference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task01
{
    public static void main(String[] args)
    {
        Set<Big> set = new HashSet<Big>();
        for (int i = 0; i < 100; i++)
        {
            Big big = new Big();
            set.add(big);
        }
        System.out.println(set);
    }

    private static class Big
    {
        private List<Long> lists = new ArrayList<Long>();
        {
            Random rnd = new Random();
            for (int i = 0; i < 100_000; i++)
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