package ua.step.example.part7.gof.model.factory;


/**
 * Абстрактная фабрика
 *
 */
public abstract class SquadronFactory {
    public abstract Mage createMage(); 

    public abstract Archer createArcher(); 

    public abstract Warrior createWarrior();
  }
