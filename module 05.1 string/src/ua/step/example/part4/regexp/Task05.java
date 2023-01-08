package ua.step.example.part4.regexp;

/**
 * 
 * Регулярные выражения
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        // регулярное выражение для проверки на правильность email адрессаы
        String regular = "[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))";

        System.out.println("unguryan@itstep.org".matches(regular));
        System.out.println("1unguryan@itstep.org".matches(regular));
        System.out.println("unguryan@@itstep.org".matches(regular));
        System.out.println("v.unguryan@itstep..org".matches(regular));
    }
}
