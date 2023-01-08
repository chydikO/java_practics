package ua.step.example.part1.enumeration.model;

public enum Month
{
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31);

	// количество дней в месяце
    private int dayNumber;

    private Month(int dayNumber)
    {
        this.dayNumber = dayNumber;
    }
    
    /**
     * 
     * @return возвращает количество дней в месяце
     */
    public int getDayNumber()
    {
        return dayNumber;
    }
}
