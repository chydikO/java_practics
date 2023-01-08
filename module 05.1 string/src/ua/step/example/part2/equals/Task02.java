package ua.step.example.part2.equals;

/**
 * 
 * Интернирование строк.
 * 
 */
public class Task02
{
    public static void main(String[] args)
    {
        String cat = "кот";
        // создание строк используя опереаор new
        String cat1 = new String("кот");
        String cat2 = new String("кот");

        System.out.printf("Опять?! %s<>%s %b%n", cat1, cat2, cat1 == cat2);
        System.out.printf("И тут провал %s<>%s %b%n", cat, cat1, cat == cat1);
 
        // так правильно сравнивать строки
        System.out.println(cat1.equals(cat2));
        // интернирование кота 
        cat1 = cat1.intern();
        System.out.println(cat == cat1);
    }
}