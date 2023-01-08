package ua.step.example.part7.gof;

import ua.step.example.part7.gof.model.factory.Archer;
import ua.step.example.part7.gof.model.factory.ElfFactory;
import ua.step.example.part7.gof.model.factory.GnomeFactory;
import ua.step.example.part7.gof.model.factory.Mage;
import ua.step.example.part7.gof.model.factory.SquadronFactory;
import ua.step.example.part7.gof.model.factory.Warrior;

/**
 * 
 * Абстрактная фабрика -  предоставляет интерфейс для создания целых семейств
 * объектов без указания конкретных классов. Объекты каждого семейства должны
 * быть логически связаны между собой.
 * 
 */
public class Task03 {
	public static void main(String[] args) {
		SquadronFactory factory = new ElfFactory();
		createSquadron(factory);

		System.out.println();
		
		factory = new GnomeFactory();
		createSquadron(factory);
	}

	/**
	 * Метод создания отряда 
	 * @param factory фабрика
	 */
	public static void createSquadron(SquadronFactory factory) {
		Mage mage = factory.createMage();
		mage.cast();
		Archer archer = factory.createArcher();
		archer.shoot();
		Warrior warrior = factory.createWarrior();
		warrior.attack();
	}
}
