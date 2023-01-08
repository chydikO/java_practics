package ua.step.example.part4.map;

import java.util.*;

/**
 * IdentityHashMap в отличии от HashMap сравнивает ключи по равенству
 * указателей, не вызывая метода equals
 * 
 */
public class Task08
{
    public static void main(String args[])
    {
        Map<String, String> map = new IdentityHashMap<String, String>();
        map.put("Mickey", "Mouse");
        map.put("Mickey", "Mantle");
        System.out.println(map.size());
        
        //FIXME измени параметры ключа таким образом, чтобы в map было два Mickey
    }
}
