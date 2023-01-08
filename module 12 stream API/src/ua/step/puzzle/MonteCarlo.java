package ua.step.puzzle;

import java.util.Random;
import java.util.stream.IntStream;

public class MonteCarlo
{
    public static void main(String[] args)
    {
        final Random rnd = new Random();
        final double r = 1000.0;
        final int max = 10000000;
        long count = IntStream.range(0, max)
                .mapToObj(i -> rnd.doubles(2).map(x -> x * r).toArray())
                .parallel()
                .filter(arr -> Math.hypot(arr[0], arr[1]) <= r)
                .count();
        System.out.println(4.0 * count / max);
    }
}
