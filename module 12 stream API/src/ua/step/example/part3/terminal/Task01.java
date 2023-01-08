package ua.step.example.part3.terminal;

import java.util.List;

import ua.step.example.model.Data;

/**
 * Match - поможет найти вхождения, соответствия обьекта шаблону. Для
 * использования также используются предикаты. Есть 3 вида сравнения: 1. Все
 * соответствуют шаблону allMatch() 2. Хоть один соответствует шаблону
 * anyMatch() 3. Ни один не соответствует noneMatch()
 */
public class Task01
{
    public static void main(String[] args)
    {
        List<String> list = Data.getList();
        // проверяет есть ли в колекции хотя бы одна строка которая начинается с
        // буквы а
        boolean anyStartsWithA = list.stream().
        // терминальная операция проверяет есть ли в коллекции хотя бы одна строка которая
        // начинаются на символ 'a'
                anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA); 

        // проверяет все ли строки в коллекции начинаются с буквы а
        boolean allStartsWithA = list.stream().
        // проверяет все ли строки в коллекции начинаются на 'a'
                allMatch((s) -> s.startsWith("a"));
        System.out.println(allStartsWithA); 

        // проверяет чтобы строки в коллекции не начинались с буквы z
        boolean noneStartsWithZ = list.stream().
        // проверяет чтобы все строки в коллекции не начинались на 'a'
                noneMatch((s) -> s.startsWith("z"));
        System.out.println(noneStartsWithZ); 
        //FIXME определи есть ли в коллекции строки, которые содержать символ 'x'
    }
}