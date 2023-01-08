package ua.step.example.part0.wrapper;

/**
 * 
 * Преобразования типов с использованием классов оберток 
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        // преобразование строки в число (примитивный тип)
    	int i1 = Integer.parseInt("123");
        System.out.println(i1);
        //i1 = Integer.parseInt("123a"); // ошибка преобразования
        
        Integer i2 = Integer.valueOf("5");
        System.out.println(i2);
        Integer i3 = Integer.valueOf(7);
        System.out.println(i3);
        
        Float f = Float.valueOf(1.3f);
        //Авто распапковка
        int i4 = Integer.valueOf("111");
        //System.out.println(i3);
        
        
        // преобразование числа в строку в двоичном представлении
        String binatyString = Integer.toBinaryString(21); 
        System.out.println(binatyString);
        
        // преобразование числа в строку в шестнадцатеричном представлении
        String hexString = Integer.toHexString(255);
        System.out.println(hexString);
        
        System.out.println("Максимальное значение int = " + Integer.MAX_VALUE);
        System.out.println("Минимальное значение int = " + Integer.MIN_VALUE);
        
        hexString = Float.toHexString(1.5f);
        //System.out.println(hexString);
        
        boolean isDigit1 = Character.isDigit('3');
        System.out.println(isDigit1);
        isDigit1 = Character.isDigit('a');
        System.out.println(isDigit1);
        boolean isUpper = Character.isUpperCase('A');
        System.out.println(isUpper);
        isUpper = Character.isUpperCase('b');
        System.out.println(isUpper);
    }
}
