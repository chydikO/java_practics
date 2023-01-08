package ua.step.example.part5.buffer;
/**
 * 
 * StringBuilder - практически не отличается от StringBuffer
 * Но его использование в однопоточной среде предпочтительнее
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Кошки это - ");
        sb.append("тепло, ");
        sb.append("добро,").append(" ").append("ласка.");
        System.out.println(sb);
    }
}