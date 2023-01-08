package ua.step.homework_2.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.step.homework_2.Task07;

public class TaskTest07 {
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
		String inputData = String.valueOf(123456);
		System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
		Task07.main(null);
		String errorMessage = "Wrong result";
		assertTrue(errorMessage, outContent.toString().trim().contains("654321"));
	}
}
