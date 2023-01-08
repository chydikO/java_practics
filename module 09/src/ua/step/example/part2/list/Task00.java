package ua.step.example.part2.list;

//TODO : обратите внимание c какого пакета импортирован интерфейс List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task00
{
    public static void main(String[] args)
    {
        // без использования генерика можно 
    	ArrayList list = new ArrayList();
        list.add(1); // можно помешать в список объекты любых типов
        list.add(null);
        list.add("abc");
        list.add(true);
        Object element = list.get(0);
        System.out.println(list);

        // с генериком комфортнее
        ArrayList<String> templateList = new ArrayList<String>();
        // list2.add(1); // можно помешать только одного типа 
        templateList.add("abc");
        templateList.add("def");
        //templateList.add(true);
        String string = templateList.get(0);
        System.out.println(string);

    }
}
