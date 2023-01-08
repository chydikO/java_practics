package ua.step.example.part3.set;

import java.util.EnumSet;
import java.util.Set;

/**
 * 
 * EnumSet Специализированная реализация Set для использования с типами
 * перечислений. Все элементы в наборе перечислений должны исходить от одного
 * типа перечислений, который указан, явно или неявно, когда создается
 * множество. EnumSet представлены внутри в виде битовых векторов. Это
 * представление является чрезвычайно компактным и эффективным.
 * Производительность этого класса очень высокая.
 *
 */
public class Task08 {
	public static void main(String[] args) {
		// все
		Set<Test> t = EnumSet.allOf(Test.class); // все элементы
		System.out.println(t);

		// включая
		t = EnumSet.of(Test.TEST2, Test.TEST3); // указанные элементы
		System.out.println(t);

		t = EnumSet.noneOf(Test.class); // пустое множество
		System.out.println(t);
		t.add(Test.TEST5);

		// исключая
		t = EnumSet.complementOf(EnumSet.of(Test.TEST1, Test.TEST7)); // все кроме указанных
		System.out.println(t);

		// диаазон 
		t = EnumSet.range(Test.TEST3, Test.TEST5);
		System.out.println(t);
	}
}

enum Test {
	TEST1, TEST2, TEST3, TEST4, TEST5, TEST6, TEST7
}