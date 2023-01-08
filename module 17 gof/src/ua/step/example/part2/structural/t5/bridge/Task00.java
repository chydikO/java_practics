package ua.step.example.part2.structural.t5.bridge;

import ua.step.example.part2.structural.t5.bridge.model.Circle;
import ua.step.example.part2.structural.t5.bridge.model.LargeCircleDrawer;
import ua.step.example.part2.structural.t5.bridge.model.Shape;
import ua.step.example.part2.structural.t5.bridge.model.SmallCircleDrawer;

/**
 * Шаблон мост (англ. Bridge) — структурный шаблон проектирования, используемый
 * в проектировании программного обеспечения чтобы «разделять абстракцию и
 * реализацию так, чтобы они могли изменяться независимо». Шаблон мост
 * использует инкапсуляцию, агрегирование и может использовать наследование для
 * того, чтобы разделить ответственность между классами.
 */
public class Task00
{
    public static void main(String[] args)
    {
        Shape[] shapes = { 
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer()) };

        for (Shape next : shapes)
        {
            next.draw();
        }
    }

}
