package ua.step.example.part0.wrapper;

/**
 * 
 * Сравнение объектов класса-обертки
 *
 */
public class Task04 {
	public static void main(String[] args) {
		Integer i1 = 3;
		Integer i2 = 3;
		System.out.println(i1 == i2); // integer pool
		System.out.println(i1.equals(i2));
		System.out.println("=======");

		Integer i3 = 129;
		Integer i4 = 129;
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("=======");

		Integer i5 = new Integer(3);
		Integer i6 = new Integer(3);
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		System.out.println("=======");

		Integer i7 = new Integer(6);
		Integer i8 = new Integer(3);
		
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean(false);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println("=======");
		
		// все классы обертки реализует интерфейс Comporable позваляющий
		// сравнивать объекты между собой
		System.out.println(i7.compareTo(i8));
	}
}
