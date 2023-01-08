package ua.step.example.generic.model;

/**
 * 
 * Класс описывает сущность ящик в который может быть положен предмет и из
 * которого можно достать ранее положенный в ящик предмет
 *
 */
public class Box <T> // шаблонный тип  
{
    // FIXME заменили тип Object на шаблонный тип <T>
    private T object;

    // FIXME заменили тип Object на шаблонный тип <T> 
    public void put(T object)
    {
        System.out.println("Предмет " + object + " положен в ящик");
        this.object = object;
    }

    // FIXME заменили тип Object на шаблонный тип <T> 
    public T get()
    {
        System.out.println("Ящик открыт");
        if (object != null)
        {
            System.out.println("Предмет доступен: " + object);
        }
        else
        {
            System.out.println("Ящик пуст");
        }
        return object;
    }
}