package ua.step.example.part1.enumeration.model;

/**
 * 
 * Времена года
 *
 */
public enum Season 
{
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;
	
    // в перичисление могут быть вложенны внутрение классы и интерфейсы
	interface A{}
    class B extends C implements A{}
    static class C{}
    // но это не обязательно ;)
}
