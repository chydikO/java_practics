package ua.step.example.generic.model;

/**
 * 
 * Класс описывает сущность ящик в который может быть положен предмет и из
 * которого можно достать ранее положенный в ящик предмет
 *
 */
public class SimpleBox 
{
    private Object object;

    public void put(Object object)
    {
        System.out.println("Предмет " + object + " положен в ящик");
        this.object = object;
    }

    public Object get()
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