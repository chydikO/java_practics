package ua.step.example.part2.equals;

/**
 * 
 * Сравнение строк. Интернирование.
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        String cat1 = "cat Tom"; // создается объект строки в string pool
        String cat2 = "cat Tom"; // ссылка на объект взята из string pool
        System.out.println("static cat: " + (cat1 == cat2)); // сравнение ссылок
        System.out.println("static cat: " + cat1.equals(cat2)); // сравнение содержимого 
        System.out.println();
        		
        cat1 = new String("cat Tom"); // новый объект строки
        cat2 = new String("cat Tom"); // новый объект строки
        System.out.println("new cat: " + (cat1 == cat2)); // сравнение ссылок
        System.out.println("new cat: " + cat1.equals(cat2)); // сравнение содержимого 
        System.out.println();
        
        cat1 = cat1.intern(); // извлечение ссылки на строку из string pool  
        cat2 = cat2.intern(); // извлечение ссылки на строку из string pool
        System.out.println("internal cat: " + (cat1 == cat2)); // обратите внимание на скобки
        System.out.println("internal cat: " + cat1.equals(cat2));
        System.out.println();
        
        // Канкатинация строк создает всегда новую строку
        String t = "t Tom";
        cat1 = "ca" + t;
        System.out.println("dynamic cat: " + (cat1 == cat2));
        System.out.println("dynamic cat: " +  cat1.equals(cat2));
    }
}