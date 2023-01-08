package ua.step.example.part5.buffer;
/**
 * 
 * Вставка символа или строки в строчный буфер 
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Я котов!"); 
        // вставка сивола в буффер после 2 символа
        sb.insert(2, "люблю "); 
        System.out.println(sb.toString());
    }
}
