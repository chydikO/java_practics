package ua.step.example.part3.terminal;

import java.util.StringJoiner;
import java.util.stream.Collector;

import ua.step.example.model.Student;
import ua.step.example.model.StudentData;

/**
 * 
 * Коллекторы. Создание собственного коллектора.
 *
 */
public class Task10
{
    public static void main(String[] args)
    {
        // Создание коллектора
        Collector<Student, StringJoiner, String> personNameCollector = Collector.of(
                () -> new StringJoiner(" | "), // supplier
                (j, p) -> j.add(p.getName().toUpperCase()), // accumulator
                (j1, j2) -> j1.merge(j2), // combiner
                StringJoiner::toString); // finish

        // приминение коллектора
        String result = StudentData.getPersons().collect(personNameCollector);
        System.out.println(result);
    }
}