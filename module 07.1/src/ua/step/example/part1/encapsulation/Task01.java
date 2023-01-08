package ua.step.example.part1.encapsulation;

import ua.step.example.part2.encapsulation.model.Student;

/**
 * 
 * Спецификаторы (модификаторы) доступа
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.name = "Петро";
        // FIXME инициализируй возраст студента
        //student.age = 4;
    }
}
