package ua.step.example.solid.model1.S;

/**
 * 
 * Класс CRUD
 *
 */
public class AccountRepository
{
    public Account getByNumber(String number)
    {
        return new Account();
    }

    public void save(Account account)
    {
        System.out.println("Счет сохранен в базу данных");
    }
}
