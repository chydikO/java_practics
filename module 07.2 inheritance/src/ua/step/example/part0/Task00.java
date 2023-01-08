package ua.step.example.part0;

import ua.step.example.part0.model.person.Student;
import ua.step.example.part0.model.person.Worker;

/**
 * 
 * Наследование (англ. inheritance) — концепция объектно-ориентированного
 * программирования, согласно которой абстрактный тип данных может наследовать
 * данные и функциональность некоторого существующего типа, способствуя
 * повторному использованию компонентов программного обеспечения.
 *
 */
public class Task00
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setName("Вася");
        student.setGroupNumber("java");

        Worker worker = new Worker();
        worker.setName("Петя");
        worker.setSpecialty("programmer");

        // FIXME Перенеси поле name и методы которые работают с данным полем из
        // классов Student и Worker в класс Person (удалите данные поля и методы
        // из классов Student и Worker)
        // FIXME Наследуй классы Student и Worker от класса Person
    }
}