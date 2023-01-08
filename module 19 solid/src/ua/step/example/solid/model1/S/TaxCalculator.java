package ua.step.example.solid.model1.S;

/**
 * 
 * Класс рассчета налога
 *
 */
public class TaxCalculator
{
    public static TaxTable calculateTaxes(Account accaunt, int year)
    {
        return new TaxTable();
    }

    public static class TaxTable
    {
    }
}
