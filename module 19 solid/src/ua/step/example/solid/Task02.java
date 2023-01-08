package ua.step.example.solid;

import ua.step.example.solid.model1.S.Account;
import ua.step.example.solid.model1.S.AccountRepository;
import ua.step.example.solid.model1.S.TaxCalculator;

/**
 * S - Разделение обязаностей
 */
public class Task02
{
    public static void main(String[] args)
    {
        
        AccountRepository repository = new AccountRepository();
        Account account = repository.getByNumber("165065016500");
        account.withdraw(100);
        repository.save(account);
        TaxCalculator.calculateTaxes(account, 2017);
    }
}