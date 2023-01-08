package ua.step.example.part3.set.model;

/**
 * 
 * Интерфейс Comparable указывает, имеет всего один метод int compareTo(T arg0)
 * в котором задаются правила сортировки текущего объекта с передаваемым в метод
 * объектом
 *
 */
public class Person /* implements Comparable<Person> */
{
	private String firstName;

	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// FIXME перегрузить методы hashCode и equals после указания преподователя
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
