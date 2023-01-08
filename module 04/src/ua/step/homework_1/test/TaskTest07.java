package ua.step.homework_1.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import ua.step.homework_1.Task07;

@RunWith(Theories.class)
public class TaskTest07 {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@DataPoints
	public static Object[][] isEmptyData = new Object[][] {
	      { "1", "1" },
	      { "2", "10" },
	      { "3", "11" },
	      { "4", "100" },
	      { "5", "101" },
	      { "6", "110" },
	      { "7", "111" },
	      { "8", "1000" },
	  };
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Theory
	public void test(final Object... testData) {
	    String inputData = (String) testData[0];
	    System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
		Task07.main(null);
		String errorMessage = "for " + inputData + " name must be " +  testData[1];
		assertTrue(errorMessage,  outContent.toString().trim().contains((CharSequence) testData[1]));
	}
}
