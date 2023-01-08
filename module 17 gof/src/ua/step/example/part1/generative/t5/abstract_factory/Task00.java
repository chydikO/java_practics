package ua.step.example.part1.generative.t5.abstract_factory;

import ua.step.example.part1.generative.t5.abstract_factory.model.Archer;
import ua.step.example.part1.generative.t5.abstract_factory.model.ElfFactory;
import ua.step.example.part1.generative.t5.abstract_factory.model.GnomeFactory;
import ua.step.example.part1.generative.t5.abstract_factory.model.Mage;
import ua.step.example.part1.generative.t5.abstract_factory.model.SquadronFactory;
import ua.step.example.part1.generative.t5.abstract_factory.model.Warrior;

/**
 * 
 * Абстрактная фабрика (англ. Abstract factory) — порождающий шаблон
 * проектирования, предоставляет интерфейс для создания семейств взаимосвязанных
 * или взаимозависимых объектов, не специфицируя их конкретных классов. Шаблон
 * реализуется созданием абстрактного класса Factory, который представляет собой
 * интерфейс для создания компонентов системы (например, для оконного интерфейса
 * он может создавать окна и кнопки). Затем пишутся классы, реализующие этот
 * интерфейс
 * 
 */
public class Task00
{
    public static void main(String[] args)
    {
        SquadronFactory elfFactory = new ElfFactory();
        createSquadron(elfFactory);

        System.out.println();

        SquadronFactory gnomeFactory = new GnomeFactory();
        createSquadron(gnomeFactory);
    }

    /**
     * Метод создания отряда
     * 
     * @param factory
     *            фабрика
     */
    public static void createSquadron(SquadronFactory factory)
    {
        Mage mage = factory.createMage();
        mage.cast();
        Archer archer = factory.createArcher();
        archer.shoot();
        Warrior warrior = factory.createWarrior();
        warrior.attack();
    }
}