package ua.step.puzzle;

/**
 * 
 * Магический exit
 *
 */
public class HelloGoodbye {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
            System.exit(42);
        } finally {
            System.out.println("Goodbye world");
        }
    } 
}

