package ua.step.example.solid.model1.S;

public class Account
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

    public void withdraw(int amount)
    {
        balance += amount;
    }

    public void transfer(int amount, Account recipient)
    {
        recipient.withdraw(amount);
    }
}
