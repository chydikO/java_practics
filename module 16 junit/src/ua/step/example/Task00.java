package ua.step.example;

/**
 *  статический импорт метода fail из класса Assert
 */
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * 
 * Тестовый метод
 *
 */
public class Task00
{
    @Test // специальное ключевое слово которое является аннотацией
    public void testMethod()
    {
        System.out.println("Тестовый метод запущен");
        fail("Комментарий на случай провала теста");
        // FIXME закоментируй строчку выше
    }
}