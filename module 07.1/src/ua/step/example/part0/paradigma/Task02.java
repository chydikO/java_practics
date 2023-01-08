package ua.step.example.part0.paradigma;

/**
 * 
 * Объектный подход в решении задачи. Описываем множество объектов предметной
 * облости в виде шаблона (класса Human).
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        // создаем массив где будем хранить ссылки на объекты типа человек
        Human[] humans = new Human[2];

        // создаем обект типа "человек" и сохраняем ссылку на него в переменной
        // human1
        Human human1 = new Human();
        
        // Заполняем данные человека в переменные экземпляра (объекта)
        human1.firstName = "Иванов";
        human1.lastName = "Иван";
        human1.middleName = "Иванович";
        humans[0] = human1; // помещаем ссылку на объект human1 в массив

        Human human2 = new Human();
        human2.firstName = "Петров";
        human2.lastName = "Петр";
        human2.middleName = "Петрович";
        humans[1] = human2;

        for (Human human : humans)
        {
            // вызов метода у объекта который имеет тип человек
            System.out.println(human.getFullName());
            // System.out.println(human.firstName + " " + human1.getInitials());
        }
    }
}

// FIXME скрыть поля класса используя модификатор доступа private
// FIXME добавить сеттеры в класс Human
// FIXME заменить присвоение значения в поля объектов на использование методдов
/**
 * 
 * Класс описывающий характеристики объекта человек
 * 
 */
class Human
{
    final static int MIN_AGE = 0; // поле класса

    String firstName; // поле (свойство) экземпляра

    String lastName; // поле (свойство)экземпляра

    String middleName; // поле (свойство) экземпляра

    int age; // поле (свойство) экземпляра

    // метод
    String getFullName()
    {
        return firstName + " " + lastName + " " + middleName;
    }

    // метод
    String getInitials()
    {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty())
        {
            sb.append(lastName.charAt(0));
            sb.append(". ");
        }
        if (middleName != null && !middleName.isEmpty())
        {
            sb.append(middleName.charAt(0));
            sb.append(".");
        }
        return sb.toString();
    }
}