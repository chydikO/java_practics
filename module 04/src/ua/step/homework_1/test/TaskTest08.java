package ua.step.homework_1.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.step.homework_1.Task08;


public class TaskTest08 {
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
		Task08.main(null);
		String errorMessage = "Wrong result";
		assertTrue(errorMessage ,  outContent.toString().trim().startsWith("00:00 01:10 02:20 03:30 04:40 05:50 10:01 11:11 12:21 13:31 14:41 15:51 20:02 21:12 22:22 23:32"));
	}
}
