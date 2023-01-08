package ua.step.example.part3.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * Упорядоченное множество
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        // HashSet не гарантирует что порядок чтения элементов совпадет с порядком добавления  
    	Set<String> characters = new HashSet<String>();
    	
    	//FIXME разкоментируй, закоментировав строку 17
    	//Set<String> characters = new LinkedHashSet<String>();

    	StringBuilder sb = new StringBuilder();
        for (char c = 'A'; c <='Z'; c++)
        {
            sb.append(c);
        	characters.add(sb.toString());
        }
        for (String string : characters) {
        	System.out.println(string);
		}
        
    }
}
