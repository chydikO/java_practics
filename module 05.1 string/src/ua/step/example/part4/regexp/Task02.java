package ua.step.example.part4.regexp;

/**
 * 
 * Регулярные выражения
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        String email = "unguryan@itstep.org";
        // + обозначает «один или несколько экземпляров непосредственно
        // предшествующего элемента
        // | обозначает «или». Подвыражения, объединенные этим способом,
        // называются альтернативами (alternatives)
        String regular = ".+\\.(com|ua|ru)";
        // метод возвращает истину, если иследуемая строка соотвествует шаблону
        System.out.println(email.matches(regular));
        // FIXME исправь пример, чтобы он возврашал true
    }
}