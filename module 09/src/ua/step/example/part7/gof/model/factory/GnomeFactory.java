package ua.step.example.part7.gof.model.factory;


public class GnomeFactory extends SquadronFactory
{
    public Mage createMage()
    {
        return new GnomeMage();
    }

    public Archer createArcher()
    {
        return new GnomeArcher();
    }

    public Warrior createWarrior()
    {
        return new GnomeWarrior();
    }

    class GnomeMage implements Mage
    {
        public void cast()
        {
            System.out.println("Гномы не используют магию");
        }
    }

    class GnomeArcher implements Archer
    {
        public void shoot()
        {
            System.out.println("Выстрел из арбалета");
        }
    }

    class GnomeWarrior implements Warrior
    {
        public void attack()
        {
            System.out.println("Удар тяжелым топором по черепушке");
        }
    }
}
