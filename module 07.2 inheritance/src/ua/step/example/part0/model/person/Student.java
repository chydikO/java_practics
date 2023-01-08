package ua.step.example.part0.model.person;

//расскоментируй для наследования от класса Person блок кода в следующей строчке
public class Student /*extends Person*/  
{
    private String name; // это поле такое же как и у рабочего

    private String groupNumber; //это поле есть только у студента

    // этот метод такой же как и в классе Worker
    public void setName(String name)
    {
        this.name = name;
    }
    
    // этот метод такой же как и в классе Worker
    public String getName()
    {
        return name;
    }

    public void setGroupNumber(String groupNumber)
    {
        this.groupNumber = groupNumber;
    }

    public String getGroupNumber()
    {
        return groupNumber;
    }
}