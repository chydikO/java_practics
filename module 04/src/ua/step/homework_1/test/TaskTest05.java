package ua.step.homework_1.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.step.homework_1.Task05;


public class TaskTest05 {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

	@Test
	public void test() {
		String inputData = String.valueOf(221122);
	    System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
		Task05.main(null);
		String errorMessage = "Wrong result";
		assertTrue(errorMessage ,  outContent.toString().contains("Yes"));
	}
	
	@Test
	public void testNoPolyndrom() {
		String inputData = String.valueOf(123324);
	    System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
		Task05.main(null);
		String errorMessage = "Wrong result";
		assertTrue(errorMessage ,  outContent.toString().contains("No"));
	}
}
