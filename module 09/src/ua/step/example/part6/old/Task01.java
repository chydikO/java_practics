package ua.step.example.part6.old;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Task01 {
	 public static void main (String[] args) 
	    { 
	        Object x = new Vector<Object>().elements(); 
	        System.out.print((x instanceof Enumeration)+","); 
	        System.out.print((x instanceof Iterator)+","); 
	        System.out.print(x instanceof ListIterator); 
	    } 
}
