package ua.step.example.part1.generative.t1.singelton.model;

/**
 * + Простая и прозрачная реализация 
 * + Потокобезопасность 
 * - Не ленивая инициализация
 * 
 */
public class SimpleSingleton
{
    public static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
    	// приватный конструктор обязателен
	}

	@Override
	public String toString() {
		return "Simple";
	}

	public void test() {
		System.out.println("Это простой Сингелтон");
	}
}
