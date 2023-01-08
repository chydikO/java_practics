package ua.step.example.part1.string;

/**
 * 
 * Замена символов в строке
 *
 */
public class Task16
{
    @SuppressWarnings("unused")
	public static void main(String[] args)
    {
    	String cat = "кит";
    	// заменяет символ и на символ о
    	cat.replace('и', 'о'); 
        System.out.println(cat);
        
        // FIXME выведите строку в которой вместо x будет стоять символ z 
        String test = "xyyyxxxxyyxyxyxyyyxyxyxy";
        
     }
}