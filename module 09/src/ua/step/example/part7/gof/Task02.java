package ua.step.example.part7.gof;

import ua.step.example.part7.gof.model.factory.Person;
import ua.step.example.part7.gof.model.factory.PersonFactory;

/**
 * 
 * Factory Method - это паттерн создания объектов (creational pattern). Данный
 * шаблон проектирования предоставляет интерфейс для создания экземпляров
 * некоторого класса. В момент создания наследники могут определить, какой класс
 * инстанциировать.
 * 
 */
public class Task02 {
	public static void main(String[] args) {
		// нельзя создать объекты класса Manager и Worker в данном пакете, так
		// как классы имеют спецификатор доступа package-private (доступны
		// только внутри пакета)
		// Manager man = new Manager();
		PersonFactory factory = new PersonFactory();
		Person person = factory.getPerson(1);
		System.out.println(person);

		person = factory.getPerson(2);
		System.out.println(person);

	}
}
