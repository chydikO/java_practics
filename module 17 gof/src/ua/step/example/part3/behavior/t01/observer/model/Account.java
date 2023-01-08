package ua.step.example.part3.behavior.t01.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account
{
    // список подписчиков
    private List<AccountListener> listeners;

    private int balance;

    public int getBalance()
    {
        return balance;
    }

    public void changeBalance(int summa)
    {
        balance += summa;
        fireChangeBalance(summa);
    }

    private void fireChangeBalance(int summa)
    {
        if (listeners != null)
        {
            for (AccountListener listener : listeners)
            {
                listener.changed(summa);
            }
        }
    }

    public void addAccountListener(AccountListener accountListener)
    {
        if (listeners == null)
        {
            listeners = new ArrayList<AccountListener>();
        }
        listeners.add(accountListener);
    }
}
