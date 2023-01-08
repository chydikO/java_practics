package ua.step.example.part2.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Преобразование массива в коллекцию и коллекции в массив
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        Integer[] inputArray = { 3, 2, 1 };
        
        // преобразование массива в список
        // возвращает не изменяемый список (обертка  массива)
        List<Integer> arrayList = Arrays.asList(inputArray); 
        System.out.println(arrayList);
        //arrayList.add(4); // !!! ошибка, так как список не изменяемый

        List<Integer> list = new ArrayList<>(arrayList);
        list.add(0);
		// преобразование список в массив

        
        String[] array = new String[5];
        //int[] array = new int[5];
        //Integer[] array = new Integer[5];
        list.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
