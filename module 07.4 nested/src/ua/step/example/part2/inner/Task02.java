package ua.step.example.part2.inner;

import ua.step.example.part2.inner.Chicken.Egg;

/**
 * 
 * Что было первым яйцо или курица?
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Chicken chicken = new Chicken("Хохлушка ");
        Chicken.Egg egg = chicken.new Egg(); // для создания яйца используем
                                             // ссылку на курицу
        egg.printParent();
        Chicken.Egg egg1 = chicken.createEgg(); // для создания яйца используем
                                                // метод курицы
        egg1.printParent();
        System.out.println(chicken);

        Chicken chicken2 = new Chicken("Пеструшка ");
        Egg egg3 = chicken2.new Egg();
        System.out.println(chicken2);
        egg3.printParent();

        Chicken newChicken = egg3.birth();
        System.out.println(newChicken.getName());
        Egg egg4 = newChicken.createEgg();
        Chicken newChicken2 = egg4.birth();
        System.out.println(newChicken2.getName());
    }
}

class Chicken
{
    private String name;
    private int countEgg;

    public Chicken(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Egg createEgg()
    {
        return new Egg();
    }

    /**
     * 
     * Яйцо - это внутренний класс курицы
     *
     */
    class Egg
    {
        private int eggNumber;

        Egg()
        {
            countEgg++;
            eggNumber = countEgg;
        }

        public void printParent()
        {
            System.out.printf("Яйцо %d от %s \n", eggNumber, name);
        }

        public Chicken birth()
        {
            System.out.println("Вылупился цыпленок из яйца " + eggNumber);
            return new Chicken("Потомок " + name);
        }
    }

    @Override
    public String toString()
    {

        return String.format("Курица %s у нее яиц %d", name, countEgg);
    }
}