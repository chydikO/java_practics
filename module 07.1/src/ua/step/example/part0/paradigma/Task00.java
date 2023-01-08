package ua.step.example.part0.paradigma;

/**
 * С точки зрения структуры программы, класс является сложным типом данных.
 */
public class Task00
{
    public static void main(String[] args)
    {
        // создание объекта класса
        Cat cat1 = new Cat();
        // инициализация характеристик объекта 
        cat1.name = "Васька";
        cat1.age = 1;
        //вызов метода объекта
        System.out.println(cat1.getStatus());
        // FIXME созайте новый объект класса Cat
        // проинициализируйте его переменные и выведие статус объекта
    }
}

/**
 * 
 * С точки зрения программирования класс можно рассматривать как набор данных
 * (полей, атрибутов, членов класса) и функций для работы с ними (методов).
 */
class Cat
{
    // поля класса, это переменные
    String name; // имя кота
    int age; // возраст кота

    /**
     * Метод класса.
     */
    String getStatus()
    {
        String status; // локальная переменная

        switch (age)
        {
            case 1:
                status = "котенок";
                break;
            default:
                status = "взрослый кот";
                break;
        }
        return status;
    }
}