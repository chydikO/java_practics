package ua.step.example.part1.enumeration;

import ua.step.example.part1.enumeration.model.Month;

/**
 * 
 * Конструкторы и свойства в перечислениях
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        int days = Month.JUNE.getDayNumber(); // использование метода перечисления
        System.out.println(days);

        //FIXME Не изменяя названия переменных в перечислении, измените перечисление
        // таким образом, чтобы этот код выводил название месяца на русском. 
        // Подсказка - переопределите в перечислении toString
         
        System.out.println("Настояшему коту и в январе " + Month.MARCH);

        Month[] months = Month.values(); // получение всех объектов перечисления в виде массива
        for (Month month : months)
        {
            System.out.println(month);
        }
    }
}
