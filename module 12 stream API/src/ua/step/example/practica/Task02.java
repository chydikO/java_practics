package ua.step.example.practica;

import java.util.stream.Stream;

import ua.step.example.model.Student;
import ua.step.example.model.StudentData;

/**
 * Практика
 */
public class Task02
{
    public static void main(String[] args)
    {
        Stream<Student> stream = StudentData.getPersons();
        stream.forEach(System.out::println);
        // FIXME с помошью stream APi для каждой группы выведи число студентов
        // младше 33 лет  
        // подсказка используй групировку или flatMap 
    }
}