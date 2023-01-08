package ua.step.example.part0.paradigma;

/**
 * 
 * Структурный подход к решению задачи.
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        String[] firstNames = new String[3];
        firstNames[0] = "Иванов";
        firstNames[1] = "Петров";
        firstNames[2] = "Сидоров";
        String[] lastNames = new String[3];
        lastNames[0] = "Иванв";
        lastNames[1] = "Петр";
        lastNames[2] = "Максим";
        String[] middleNames = new String[3];
        middleNames[0] = "Иваныч";
        middleNames[1] = "Петрович";
        middleNames[2] = "Емельянович";
        String[] io = new String[3];
        io[0] = "П.С.";
        io[1] = "П.М.";
        io[2] = "М.Е.";

        String fullName = firstNames[2] + " " + lastNames[2] + " "
                + middleNames[2];
        System.out.println(fullName);

        fullName = firstNames[0] + " " + lastNames[1] + " " + middleNames[0];
        System.out.println(fullName);

        String shortName = firstNames[2] + " " + io[2];
        System.out.println(shortName);
    }
}