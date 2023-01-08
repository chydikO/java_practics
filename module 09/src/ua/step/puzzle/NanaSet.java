package ua.step.puzzle;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NanaSet
{
    public static void main(String[] args)
    {
        Set<Float> sets = new HashSet<Float>();
        sets.add(Float.NaN);
        sets.add(Float.NaN);
        sets.add(.1f);
        sets.add(0.2f);
        sets.add(Float.POSITIVE_INFINITY);
        sets.add(Float.POSITIVE_INFINITY);
        sets.add(Float.NEGATIVE_INFINITY);
        sets.add(Float.NEGATIVE_INFINITY);
        sets.add(0.3f);
        System.out.println(sets);
        
        Set<Float> treeSets = new TreeSet<Float>();
        treeSets.add(Float.NaN);
        treeSets.add(Float.NaN);
        treeSets.add(.1f);
        treeSets.add(Float.NaN);
        treeSets.add(0.2f);
        treeSets.add(Float.POSITIVE_INFINITY);
        treeSets.add(Float.POSITIVE_INFINITY);
        treeSets.add(Float.NEGATIVE_INFINITY);
        treeSets.add(0.3f);
        treeSets.add(Float.NEGATIVE_INFINITY);
        System.out.println(treeSets);

    }
}
