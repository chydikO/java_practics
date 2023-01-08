package ua.step.example.part3.local;

/**
 * 
 * Локальные классы
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        printPhoneNumbers("+380 44 4683793", "5498764");
    }

    public static void printPhoneNumbers(String... phoneNumbers)
    {
        // нельзя объявлять статические поля
        // static int test;
        
        int x = 3;
        // x++; // переменная x является эффективно-финальной
        // локальный класс
        class PhoneNumber
        {
            private String phoneNumber;

            PhoneNumber(String phoneNumber)
            {
                this.phoneNumber = phoneNumber;
            }

            @Override
            public String toString()
            {
                StringBuilder sb = new StringBuilder();
                sb.append(phoneNumber);
                String onlyNumber = phoneNumber.replaceAll("[+\\s]", "");
                if (phoneNumber.startsWith("+") || onlyNumber.length() == 12)
                {
                    // можно использовать локальные переменные метода только
                    // если они финальные (или эффективно-финальные)
                    sb.append(x + " международный ");
                }
                return sb.toString();
            }
            // нельзя объвялять статические методы
            // public static void test(){}
        }

        for (String number : phoneNumbers)
        {
            PhoneNumber phoneNumber = new PhoneNumber(number);
            System.out.println(phoneNumber);
        }
    }
}
