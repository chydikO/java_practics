package ua.step.example.generic;

import ua.step.example.generic.model.Box;

public class Task06
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {
        Box<String> box = new Box<>();
        doSomething(box);
        doHack(box);
        String result = box.get();
        System.out.println(result);
    }

    public static <T> void doSomething(Box<T> box)
    {
        // нельзя создать объект шаблонного типа
        // T copy = new T();
        //box.put(copy);
    }

    public static <T> void  doHack(Box<T> box) throws InstantiationException, IllegalAccessException
    {
        T copy = (T) box.getClass().newInstance();
        box.put(copy);
    }
}
