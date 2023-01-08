package ua.step.examples.part3.bits;

import static ua.step.examples.util.helper.Binary.printToBinary;

import ua.step.examples.util.helper.BitOperationViewer;

/**
 * 
 * Сдвиг битов влево
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        int a = 7;
        int b = 1;
        printToBinary(a);
        System.out.println(" << ");
        printToBinary(b);
        System.out.println(" =");
        int i = a << b; // сдвиг влево
        printToBinary(i);
        System.out.println(i);
        System.out.println();
        // FIXME увеличь значение переменной b и проанализируй результат
        BitOperationViewer.main(new String[]{"<<"});
    }
}
