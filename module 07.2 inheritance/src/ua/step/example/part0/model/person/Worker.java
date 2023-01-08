package ua.step.example.part0.model.person;

//расскоментируй для наследования от класса Person блок кода в следующей строчке
public class Worker /*extends Person*/
{
    private String name; // это поле такое же как и у студента 

    private String specialty; // это поле есть только у рабочего

    // этот метод такой же как и в классе Stident
    public void setName(String name)
    {
        this.name = name;
    }

    // этот метод такой же как и в классе Stident
    public String getName()
    {
        return name;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public String getSpecialty()
    {
        return specialty;
    }
}
