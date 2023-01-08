package ua.step.example.model;

import java.io.Serializable;

/**
 * 
 * Сериализуемый класс
 * 
 */
public class Person /*implements Serializable */
{
    // версия сериализации
    private static final long serialVersionUID = 1L;

    private String name;

    private int age;

    /**
     * значене поля не будет сериализовано так как присутствует ключевое слово
     * transient - запрешающее сериализацию этого поля
     */
    transient private char firstLetter;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        if (!name.isEmpty())
        {
            this.firstLetter = name.charAt(0);
        }
    }

    public char getFirstLetter()
    {
        return firstLetter;
    }

    @Override
    public String toString()
    {
        return name + " " + age;
    }
}