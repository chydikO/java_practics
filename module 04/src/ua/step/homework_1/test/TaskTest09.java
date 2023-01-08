package ua.step.homework_1.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.step.homework_1.Task09;


public class TaskTest09 {
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
		Task09.main(null);
		String errorMessage = "Wrong result";
		assertTrue(errorMessage ,  outContent.toString().contains("233168"));
	}
}
