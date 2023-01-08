package ua.step.example.part1.enumeration;

import ua.step.example.part1.enumeration.model.AbstractDirection;

/**
 * 
 * Использование абстрактных методов в перечислении 
 *
 */
public class Task05 {
	public static void main(String[] args) {
        AbstractDirection direction = AbstractDirection.DOWN;
        System.out.println(direction.getOpposite());
        
        //direction = AbstractDirection.RIGHT;
        System.out.println(direction.getOpposite());
	}
}
