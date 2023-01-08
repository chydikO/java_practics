package ua.step.example.part4.map.model;

public class HashPerson // implements Comparable<HashPerson>
{
    private String firstName;

    private String lastName;

    public HashPerson(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    //FIXME перегрузить методы hashCode и equals после указания преподователя
}
