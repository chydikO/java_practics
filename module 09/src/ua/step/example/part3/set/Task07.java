package ua.step.example.part3.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Остортированное множество. 
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        //Set<Integer> tree = new TreeSet<Integer>(); 
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(12);
        tree.add(23);
        tree.add(34);
        tree.add(45);
        Iterator<Integer> iterator = tree.iterator();
        System.out.print("Tree set data: ");
        // Выводим на экран данные TreeSet
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // Проверяем, пусто или нет
        if (tree.isEmpty())
        {
            System.out.print("Tree Set is empty.");
        }
        else
        {
            System.out.println("Tree Set size: " + tree.size());
        }
        // Получаем первый элемент
        System.out.println("First data: " + tree.first()); // метод есть только у реализации TreeSet
        // Получаем последний элемент
        System.out.println("Last data: " + tree.last()); // метод есть только у реализации TreeSet
        
        if (tree.remove(30))
        {
            System.out.println("Data is removed from tree set");
        }
        else
        {
            System.out.println("Data doesn't exist!");
        }
        System.out.print("Now the tree set contain: ");
        iterator = tree.iterator();
        // Выводим на экран TreeSet
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of tree set: " + tree.size());
        // удаляем все элементы
        tree.clear();
        if (tree.isEmpty())
        {
            System.out.print("Tree Set is empty.");
        }
        else
        {
            System.out.println("Tree Set size: " + tree.size());
        }
    }
}
