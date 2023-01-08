package ua.step.example.part3.terminal;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ua.step.example.model.Student;
import ua.step.example.model.StudentData;

/**
 * 
 * Коллекторы.
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        // нахождение среднего значения
        Double averageAge = StudentData.getPersons().
                collect(Collectors.averagingInt(p -> p.getAge()));
        System.out.println("Средний возраст" + averageAge);

        // статистика
        IntSummaryStatistics sum = StudentData.getPersons().
                collect(Collectors.summarizingInt(p -> p.getAge()));
        System.out.println(sum);

        // группировка
        Map<Object, List<Student>> group = StudentData.getPersons().
                collect(Collectors.groupingBy(p -> p.getAge()));
        System.out.println(group);
    }
}