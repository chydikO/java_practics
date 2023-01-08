package ua.step.example.part1.generative.t3.builder;

/**
 * 
 * Строитель (builder). Отделяет конструирование сложного объекта от его
 * представления, так что в результате одного и того же процесса конструирования
 * могут получаться разные представления.
 * 
 */
public class Task00
{
    public static void main(String[] args)
    {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
        //FIXME создай пиццу со специями
    }
}

/** "Product" */
class Pizza
{
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough)
    {
        this.dough = dough;
    }

    public void setSauce(String sauce)
    {
        this.sauce = sauce;
    }

    public void setTopping(String topping)
    {
        this.topping = topping;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Pizza [dough=").append(dough).append(", sauce=").append(sauce).append(", topping=")
                .append(topping).append("]");
        return builder.toString();
    }
}

/** "Abstract Builder" */
abstract class PizzaBuilder
{
    protected Pizza pizza;

    public Pizza getPizza()
    {
        return pizza;
    }

    public void createNewPizzaProduct()
    {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}

/** "ConcreteBuilder" */
class HawaiianPizzaBuilder extends PizzaBuilder
{
    public void buildDough()
    {
        pizza.setDough("cross");
    }

    public void buildSauce()
    {
        pizza.setSauce("mild");
    }

    public void buildTopping()
    {
        pizza.setTopping("ham+pineapple");
    }
}

/** "ConcreteBuilder" */
class SpicyPizzaBuilder extends PizzaBuilder
{
    public void buildDough()
    {
        pizza.setDough("pan baked");
    }

    public void buildSauce()
    {
        pizza.setSauce("hot");
    }

    public void buildTopping()
    {
        pizza.setTopping("pepperoni+salami");
    }
}

/** "Director" */
class Waiter
{
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb)
    {
        pizzaBuilder = pb;
    }

    public Pizza getPizza()
    {
        return pizzaBuilder.getPizza();
    }

    /**
     * метод создающий пиццу
     */
    public void constructPizza()
    {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}