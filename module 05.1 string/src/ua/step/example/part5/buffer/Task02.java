package ua.step.example.part5.buffer;

/**
 * Добавление объектов в строчный буфер
 */
public class Task02
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        for (char c = 'A'; c < 'Z'; c++)
        {
            sb.append(c);
        }
        System.out.println(sb);
        // FIXME исправь пример чтобы выводилась строка в виде
        // A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y
    }
}