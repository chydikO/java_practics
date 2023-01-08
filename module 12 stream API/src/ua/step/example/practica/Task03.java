package ua.step.example.practica;

import java.util.stream.Stream;

import ua.step.example.model.Student;
import ua.step.example.model.StudentData;

/**
 * Практика 3
 */
public class Task03
{
    public static void main(String[] args)
    {
        Stream<Student> stream = StudentData.getPersons();
        stream.forEach(System.out::println);
        // FIXME с помошью stream APi найди средний возраст всех мужчин группы java 2
    }
}