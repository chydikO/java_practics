package ua.step.example.solid.model4.I;

public class Cat implements Animal{

	@Override
	public void jump() {
		System.out.println("Кот прыгает");
	}

	@Override
	public void fly() {
		System.out.println("Кот не может летать");
	}

	@Override
	public void eat() {
		System.out.println("Едим консервы");
		
	}

	@Override
	public void swim() {
		System.out.println("Кот плывет, но на морде ненависть");
	}
}
