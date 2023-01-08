package ua.step.example.part1.generative.t5.abstract_factory.model;


/**
 * Абстрактная фабрика
 *
 */
public abstract class SquadronFactory {
    public abstract Mage createMage(); 

    public abstract Archer createArcher(); 

    public abstract Warrior createWarrior();
  }
