package ua.step.example.part1.encapsulation;

/**
 * this - это ссылка на ОБЪЕКТ класса вызвавший метод, которая не явно
 * передается в НЕ статичесий метод класса
 */
public class Task04
{
    public static void main(String[] args)
    {
        Person nikola = new Person();
        nikola.setName("Коля");
        System.out.println(nikola.getName());

        Person vova = new Person();
        vova.setName("Вова");
        System.out.println(vova.getName());
    }
}

class Person
{
    private String name;

    public void setName(String name)
    {
        name = name;
        // this.name = name;
    }

    public static void setStaticName(String name)
    {
        // нельзя обращаться к this в статических методах, так как статический
        // метод вызывается не у объекта, а у класса

        // this.name = name;
    }

    public String getName()
    {
        // если сокрытия переменных нет this можно не использовать
        return name;
    }
}