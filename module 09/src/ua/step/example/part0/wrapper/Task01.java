package ua.step.example.part0.wrapper;

/**
 * 
 * Обертки примитивных типов. Автоматическая упаковка и распаковка. 
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        Byte byte1 = new Byte((byte)1);
        System.out.println(byte1);
        
        //Автоматическая упаковка
        Byte byte2 = (byte) 2; // создается объект класса Byte
        System.out.println(byte2);

        
        Integer i = 5;  // создается объект класса Integer
        test(3); // автоупаковка при вызове метода
        test(i);
        //test(byte1); // неявное преобразования типов не работает для классов-оберток
        
        //Автоматическая распаковка
        byte b1 = byte2;
        int i1 = new Integer (5);  
        test(i1);
        
        //При компиляции java заменяет код выше на код ниже 
        byte b2 = byte2.byteValue();
    }
    
    public static void test(Integer value)
    {
    	System.out.println(value);
    }
    
/*    public static void test(Number value)
    {
    	System.out.println(value);
    }*/
}
