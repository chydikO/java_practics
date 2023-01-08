package ua.step.example.solid;

import ua.step.example.solid.model1.S.TaxCalculator.TaxTable;

/**
 * 
 * Класс Account несет ответственность за:
 * 
 * Персистентность; Логику управление балансом; Логику расчета налогов. Все эти
 * "миссии" и являются теми самыми мотивами, которые влияют на жизненный цикл
 * класса.
 */
public class Task01
{
    public static void main(String[] args)
    {
        Account account = new Account();
        account.calculateTaxes(2014);
    }

    static class Account
    {
        private long id;
        private long balance;
        private String number;

        public long getId()
        {
            return id;
        }

        public String getNumber()
        {
            return number;
        }

        public long getCurrentBallance()
        {
            return balance;
        }

        public long getDeposit()
        {
            return balance;
        }

        /**
         * 
         * Снятие
         */
        public void withdraw(int amount)
        {
            balance -= amount;
        }

        /**
         * перевод средств
         */
        public void transfer(int amount, Account recipient)
        {
        }

        /**
         * Расчет налогов
         */
        public TaxTable calculateTaxes(int year)
        {
            return new TaxTable();
        }
    }
}