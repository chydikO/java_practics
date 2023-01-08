package ua.step.examples.part3.bits;

import static ua.step.examples.util.helper.Binary.*;

import ua.step.examples.util.helper.BitSwitcher;

/**
 * Простой перевод в десятиччную систему. 2 в степени n всему голова.
 * 
 */
public class Task01
{
    public static void main(String[] args)
    {
        byte bb = 10;
        System.out.println("Суммируем степени двойки в разрядах,\nгде значение равно 1");
        System.out.println();
        System.out.println("128 64  32  16  8   4   2   1");
        System.out.println("_____________________________");
        System.out.println();
        printSpaceToBinary(bb);
        System.out.println("_____________________________");
        System.out.println("                8   +   2     = 10");
        // специальная программа для визуального представления перевода с
        // двоичной в другие системы счисления
        BitSwitcher.main(new String[] { "-b8" });
    }
}