package ua.step.example.generic;

/**
 * 
 * Wildcards - super и extends
 *
 */
public class Task08
{
    static class Box<T>
    {
    }

    interface Interface
    {
    }

    class ParentBase
    {
    }

    class Base extends ParentBase implements Interface
    {
        /* реализует интерфейс Interface */}

    class ChildBase extends Base
    {
        /* наследуется от класса Base который реализует интерфейс Interface */}

    public static void main(String[] args)
    {
        Box<Interface> boxI = new Box<Interface>();
        Box<Base> boxA = new Box<Base>();
        Box<ChildBase> boxB = new Box<ChildBase>();
        Box<ParentBase> boxP = new Box<ParentBase>();
        // testBoxExtendsA(boxI); // Interface является супером для Base, а не
        // его наследником.
        // testBoxExtendsA(boxP);

        testBoxExtendsA(boxA);
        testBoxExtendsA(boxB);

        testBoxSuper(boxI);
        testBoxSuper(boxA);
        testBoxSuper(boxP);
        // testBoxSuper(boxB); // ChildBase не является суперклассом для Base
    }

    /**
     * 
     * Принимаются только объекты параметрезированные классом Base или его
     * наследниками
     */
    public static void testBoxExtendsA(Box<? extends Base> box)
    {
    }

    /**
     * 
     * Принимаются только объекты параметрезированные классом Base или его
     * суперклассами
     */
    public static void testBoxSuper(Box<? super Base> box)
    {
    }
}