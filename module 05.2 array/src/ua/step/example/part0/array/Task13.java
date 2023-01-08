package ua.step.example.part0.array;

/**
 * 
 * Ошибка выхода за пределы массива и ошибка NullPointerException
 *
 */
public class Task13
{
    public static void main(String[] args)
    {
        String[] cats = new String[] { "Васька", "Мурка", "Боня", };
        // индекс 3 - это четвертый элемент, ошибка так как элементов всего 3
        int badIndex = 3;
        String s = cats[badIndex];

        // создание нового массива, в котором все элементы равны null
        cats = new String[3];
        cats[0] = s;
        
        // элемент еще не присваивался поэтому будет возвращен null
        String s1 = cats[1];
        System.out.println(s1.charAt(0));
        // FIXME исправь пример, чтобы выводилась последняя буква третьего
        // слова.
    }
}