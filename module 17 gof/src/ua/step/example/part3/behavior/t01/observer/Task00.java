package ua.step.example.part3.behavior.t01.observer;

import ua.step.example.part3.behavior.t01.observer.model.Account;
import ua.step.example.part3.behavior.t01.observer.model.AccountListener;

/**
 * 
 * Наблюдатель (observer)- этот шаблон проектирования также известен под именами
 * Dependents (Подчиненные) и Publisher-Subscriber (Издатель-Подписчик).
 * Реализация данного паттерна используется для наблюдения за состоянием
 * объектов в системе. Если состояние объектов изменяется в процессе их
 * жизненного цикла, то Наблюдатель оповещает другие части системы об этих
 * событиях.
 * 
 */
public class Task00
{
    public static void main(String[] args)
    {
        Account account = new Account();
        account.addAccountListener(new AccountListener()
        {
            @Override
            public void changed(int summa)
            {
                System.out.println("SMS balans = " + summa);
            }
        });
        account.changeBalance(10);
        // FIXME добавить вывод квитанции на принтер, при изменении счета
    }

    static class PrintListener implements AccountListener
    {
        @Override
        public void changed(int summa)
        {
            System.out.println("Print -" + summa);
        }
    }
}