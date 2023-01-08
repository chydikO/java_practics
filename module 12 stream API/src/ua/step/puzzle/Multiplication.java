package ua.step.puzzle;

import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Multiplication
{
    public static void main(String[] args)
    {
        IntFunction<IntFunction<String>> function = i -> j -> String.format("%d x %2d = %2d", i, j, i * j);
        IntFunction<IntFunction<IntFunction<String>>> repeaterX = count -> i -> j ->
                IntStream.range(0, count)
                        .mapToObj(delta -> function.apply(i + delta).apply(j))
                        .collect(Collectors.joining("\t"));
        IntFunction<IntFunction<IntFunction<IntFunction<String>>>> repeaterY = countY -> countX -> i -> j ->
                IntStream.range(0, countY)
                        .mapToObj(deltaY -> repeaterX.apply(countX).apply(i).apply(j + deltaY))
                        .collect(Collectors.joining("\n"));
        IntFunction<String> row = i -> repeaterY.apply(10).apply(4).apply(i).apply(1) + "\n";
        IntStream.of(2, 6).mapToObj(row).forEach(System.out::println);

    }
}
