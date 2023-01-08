package ua.step.example.part1.generative.t5.abstract_factory.model;

public class ElfFactory extends SquadronFactory
{
    public Mage createMage()
    {
        return new ElfMage();
    }

    public Archer createArcher()
    {
        return new ElfArcher();
    }

    public Warrior createWarrior()
    {
        return new ElfWarrior();
    }
}

class ElfMage implements Mage
{
    public void cast()
    {
        System.out.println("Магия эльфов");
    }
}

class ElfArcher implements Archer
{
    public void shoot()
    {
        System.out.println("Выстрел из эльфийского лука");
    }
}

class ElfWarrior implements Warrior
{
    public void attack()
    {
        System.out.println("Удар эльфийским мечом");
    }
}