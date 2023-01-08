package ua.step.example.part3.terminal;

import java.util.List;

import ua.step.example.model.Data;

/**
 * reduce + бинарная функция - вычисление списка уникальных символов в наборе строк
 */
public class Task05
{
    public static void main(String[] args)
    {
        List<String> list = Data.getList();
        String u = list.stream().reduce("", (p, c) -> removeDuplicates(p + c));
        System.out.println(u);
    }

    static String removeDuplicates(String s)
    {
        StringBuilder noDupes = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            String si = s.substring(i, i + 1);
            if (noDupes.indexOf(si) == -1)
            {
                noDupes.append(si);
            }
        }
        return noDupes.toString();
    }
}