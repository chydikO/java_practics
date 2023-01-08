package ua.step.example.solid.model5.D;

public class Imap4Protocol implements MailProtocol {
	private String name = "IMAP4";

	public void send(String message) {
		System.out.printf("Send by %s: %s", name, message);
	}
}