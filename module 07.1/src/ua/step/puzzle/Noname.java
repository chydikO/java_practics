package ua.step.puzzle;

public class Noname{ 
	static {
		Test2.name = "Noname";
	}
    private static class Test2 { 
        public static String name = "Name"; 
    } 
     
    public static void main(String[] args) { 
        System.out.println(Test2.name); 
    } 
} 

