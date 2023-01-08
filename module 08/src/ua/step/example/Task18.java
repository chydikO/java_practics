package ua.step.example;

/**
 * 
 * Будет поймано, то что брошено, а не то что формально объявлено
 *
 */
public class Task18 {
	public static void main(String[] args) {
		try {
			// ссылка типа Throwable указывает на объект типа Exception
			Throwable t = new Exception(); 
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
	}
}
