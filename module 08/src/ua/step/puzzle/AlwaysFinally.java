package ua.step.puzzle;

/**
 * 
 * Не запуская определи какой будет результат выполненеия кода, объясни результат.
 *
 */
public class AlwaysFinally {
	public static void main(String[] args) {
		System.out.println(test());
	}
	@SuppressWarnings("finally")
	public static int test()  {
		try {
			if (test() ==-1)
			{
				throw new Exception();
			}
			return 1;
		} catch (Exception e) {
			return 0;
		}
		finally {
			return -1;
		}
	}
}

