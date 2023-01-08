package ua.step.puzzle;
import java.math.BigDecimal;

public class TestBig
{
    public static void main(String[] args)
    {
        BigDecimal payment = new BigDecimal(2.0);
        BigDecimal cost = new BigDecimal(1.1);
        System.out.println(payment.subtract(cost));
    }
}