package ua.step.example.part1.sources;

import java.util.stream.Stream;

/**
 * Получение бесконечного итерируемого стрима. 
 * 
 */
public class Task05
{
    public static void main(String[] args)
    {
        // стрим получается путем расчета нового значения с помошью унарного оператора
        Stream<Integer> streamIterated = Stream.iterate(1, n -> n + n)
                // так как стрим бесконечный, ограничиваем результат
                .limit(20);
        streamIterated.forEach(System.out::println);
    }
}