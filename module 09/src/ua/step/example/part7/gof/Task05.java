package ua.step.example.part7.gof;

/**
 * 
 * Адаптер (adapter). Система поддерживает требуемые данные и поведение,
 * но имеет неподходящий интерфейс.
 *
 */
public class Task05 {
	public static void main(String[] args) {
		Circle circle = new Circle(2);
		// drawShape(circle); так не получится, так как класс Circle не
		// реализует интерфейс Shape
		CircleAdapter adapter = new CircleAdapter(circle);
		drawShape(adapter);
	}
	
	/**
	 * 
	 * Метод который уже есть в нашей программе и менять его не хотелось бы
	 */
	public static void drawShape(Shape shape) {
		shape.draw();
	}
}

interface Shape {
	void draw();
}

/**
 * 
 * Класс адаптер
 *
 */
class CircleAdapter implements Shape {
	private Circle circle;

	public CircleAdapter(Circle circle) {
		this.circle = circle;
	}

	@Override
	public void draw() {
		circle.draw();
	}
}

/**
 * 
 * Этот класс и интерфейс мы менять не можем, представьте что они находятся в
 * стороней библиотеке
 *
 */
class Circle implements AreaCalculator {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Рисуем круг");

	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}

interface AreaCalculator {
	double getArea();
}
