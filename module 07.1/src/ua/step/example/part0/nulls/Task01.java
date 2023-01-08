package ua.step.example.part0.nulls;

/**
 * 
 * null - Ошибка на миллиард долларов
 *
 */
public class Task01
{
    @SuppressWarnings({ "unused", "null" })
    public static void main(String[] args)
    {
        int[] mas = null; // null может быть установлен для массива
        String str = null; // null может быть установлен для String
        String myStr = (String) null; // null можно привести к строке, но это все еще будет null

        // null может быть установлен для классов оберток
        Integer itr = null;
        Double dbl = null;
        Integer myItr = (Integer) null;
        Double myDbl = (Double) null;
        
        char c = str.charAt(0);
        System.out.println(c);
        // null можно передать в метод который в качестве параметра содержит ссылочный тип
        test(null);
    }
    
    public static void test(String str) {
        System.out.println(str.length());
    }
}