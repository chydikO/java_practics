package ua.step.puzzle;

/**
 * Обясните почему данный код работает.
 *
 */
public class MagicRedefinition {
	public static void main(String[] args) {

		A a = new D();
		Object o = a.get();
		System.out.println(o);
	}
}

class A {
	Object get() {
		return new Boolean(true);
	}
}

class B extends A {
	Number get() {
		return new Float(0.1);
	}
}

class D extends B {
	Integer get() {
		return new Integer(1);
	}
}
