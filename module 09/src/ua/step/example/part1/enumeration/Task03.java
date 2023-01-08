package ua.step.example.part1.enumeration;

import ua.step.example.part1.enumeration.model.Season;

/**
 * Преобразование строчного представления в объект перечисления
 */
public class Task03
{
    public static void main(String[] args)
    {
        Season s1 = Season.valueOf("WINTER");
        Season s2 = Season.valueOf("BUCHABYR"); // !!! 
        Season s3 = Season.valueOf(null); // !!!

        Season season = Season.WINTER;
        System.out.println("season.name()=" + season.name()
                + " \nseason.toString()=" + season.toString()
                + " \nseason.ordinal()=" + season.ordinal());
    }
}
