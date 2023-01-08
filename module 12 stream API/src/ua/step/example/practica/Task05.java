package ua.step.example.practica;

import java.util.stream.Stream;

import ua.step.example.model.Student;
import ua.step.example.model.StudentData;

/**
 * Практика 5
 */
public class Task05
{
    public static void main(String[] args)
    {
        Stream<Student> stream = StudentData.getPersons();
        stream.forEach(System.out::println);
        // FIXME с помошью stream APi отсортировать студентов сначал по полу, а
        // потом по возрасту
    }
}