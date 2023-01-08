package ua.step.example.part1.enumeration;

import ua.step.example.part1.enumeration.model.Season;

/**
 * 
 * Пречисления
 *
 */
public class Task01 {
	public static void main(String[] args) {
		Season season = Season.WINTER;
		if (season == Season.SPRING) // можно сравнивать через ===
		{
			System.out.println("Всем шампанского");
		} else if (season == Season.WINTER) {
			System.out.println("Бррр.. Водки!!!");
		}

		season = Season.WINTER;
		// Seasons season = null;
		switch (season) // можно использовать в switch
		{
		case SPRING:
			System.out.println("Весна");
			break;
		case SUMMER:
			System.out.println("Лето");
			break;
		case AUTUMN:
			System.out.println("Осень");
			break;
		case WINTER:
			System.out.println("Зима");
			break;
		default:
			System.out.println("Нет такого времени года");
		}
		
		/**
		 * Объявляя enum мы неявно создаем класс производный от java.lang.Enum.
		 * Условно конструкция enum Season { ... } эквивалентна class Season
		 * extends java.lang.Enum { ... }. И хотя явным образом наследоваться от
		 * java.lang.Enum нам не позволяет компилятор, все же в том, что enum
		 * наследуется, легко убедиться с помощью reflection:
		 */
		System.out.println("Суперкласс для перечисления это " + Season.class.getSuperclass());
	}
}
