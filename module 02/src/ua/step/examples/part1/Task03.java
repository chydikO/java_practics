package ua.step.examples.part1;

/**
 * Переменные целочисленных типов
 * 
 */
public class Task03
{
     public static void main(String[] args)
    {
        // **********************************************
        // переменная типа байт
        byte b2 = 1;

        // нельзя присвоить в переменную значения, которые больше или меньше
        // возможного дипазона значений
        // byte b3 = 128;
        // byte b4 = -129;

        // **********************************************
        short s1 = 3;
        System.out.println(s1);
        s1 = 2;
        System.out.println(s1);
        // s1 = b1;
        s1 = b2;
        System.out.println(s1);

        // Нельзя называть переменные начиная с цифры
        // int 1i = 5;

        // плохая практика использовать символ $ и _ в назавнии переменных
        int $ = 5;
        System.out.println($);
        int _ = 5; 
        System.out.println(_);

        int i1 = 2147483647;
        // System.out.println(i1);
        int i2 = -2147483648;

        int i3 = 148_245_845; // разделитель разрядов (появился только в java 7)

        // регистр в названии переменных имеет значение
        int A = 2;
        int a = 1;
        int а = 3; // не только регистр имеет значение
        System.out.println(A);
        System.out.println(a);
        System.out.println(а);
    }
}