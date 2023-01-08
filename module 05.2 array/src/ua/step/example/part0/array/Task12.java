package ua.step.example.part0.array;

import java.util.Arrays;

/**
 * 
 * Установка значений элементов в цикле.
 *
 */
public class Task12
{
    public static void main(String[] args)
    {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = i;
        }
        System.out.println(Arrays.toString(mas));
    }
}
// FIXME заполни массив случайными числами от 0 до 99