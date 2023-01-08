package ua.step.example.part2.encapsulation.model;

public class Student
{
    // открытое поле
    public String name;
    
    // package-private зашишенное пакетом 
    int age;
    
    // защищенное классом поле 
    protected String sex;
    
    // закрытое поле
    private String cheatSheet;
}
