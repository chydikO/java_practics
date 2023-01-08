package ua.step.puzzle;

import java.math.BigInteger;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Fibonatchi
{
    static final int SIZE = 1;
    static BinaryOperator<BigInteger> action = (x, y) -> {
        return x.add(y);
    };

    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        classicMethod();
        System.out.printf("%d ms", System.currentTimeMillis() - startTime);
        // streamMethod();
    }

    public static void classicMethod()
    {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < SIZE; i++)
        {
            BigInteger temp = second.add(first);
            first = second;
            second = temp;
            sum = action.apply(sum, first);
            System.out.println(sum);
        }
    }

    public static void streamMethod()
    {
        stream().limit(SIZE).reduce(BigInteger.ZERO, (x, y) -> {
            return x.add(y);
        });
    }

    private static Stream<BigInteger> stream()
    {
        return Stream.generate(new Supplier<BigInteger>()
        {
            BigInteger first = BigInteger.ONE;
            BigInteger second = BigInteger.ONE;

            @Override
            public BigInteger get()
            {
                BigInteger temp = second.add(first);
                first = second;
                second = temp;
                return null;
            }
        });
    }
}