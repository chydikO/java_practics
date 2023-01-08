package ua.step.example.generic;

import ua.step.example.generic.model.Apple;
import ua.step.example.generic.model.RottenApple;

/**
 * Переупаковка с помощью generic метода Bounded type argument
 *
 */
public class Task09
{
    // шаблонный класс
    static class Box<T>
    {
        private T t;

        public void set(T t)
        {
            this.t = t;
        }

        public T get()
        {
            return t;
        }
    }

    public static void main(String[] args)
    {
        Box<Apple> boxApple = new Box<Apple>();
        Box<RottenApple> boxRottenApple = new Box<RottenApple>();
        boxRottenApple.set(new RottenApple());
        merge(boxApple, boxRottenApple);
        System.out.println(boxApple.get());
    }

    /**
     * Шаблонный метод
     */
    public static <M, N extends M> void merge(Box<M> box1, Box<N> box2)
    {
        N n = box2.get();
        box1.set(n);
    }
}
