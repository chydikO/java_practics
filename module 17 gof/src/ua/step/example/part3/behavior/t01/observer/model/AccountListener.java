package ua.step.example.part3.behavior.t01.observer.model;

/**
 * Интерфейс отслеживания изменения баланса на счете
 */
public interface AccountListener
{
    /**
     * Метод подписчика, который будет вызван в случае возникновения события у издателя
     */
    public void changed(int summa);
}
