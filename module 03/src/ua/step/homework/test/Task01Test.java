package ua.step.homework.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import ua.step.homework.Task01;

@RunWith(Theories.class)
public class Task01Test {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@DataPoints
	public static Object[][] isEmptyData = new Object[][] {
	      { "1", "Monday" },
	      { "2", "Tuesday" },
	      { "3", "Wednesday" },
	      { "4", "Thursday" },
	      { "5", "Friday" },
	      { "6", "Saturday" },
	      { "7", "Sunday" },
	      { "8", "Unknown" },
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
	public void testTask01(final Object... testData) {
	    String inputData = (String) testData[0];
	    System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
		Task01.main(null);
		String errorMessage = "for " + inputData + " name must be " +  testData[1];
		assertTrue(errorMessage,  outContent.toString().contains((CharSequence) testData[1]));
	}
}
