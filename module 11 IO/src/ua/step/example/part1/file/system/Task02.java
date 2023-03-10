package ua.step.example.part1.file.system;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

/**
 * Работа с файловой системой. Получение информации по файлу.
 * Класс Files и Path появлись в версии 1.7
 */
public class Task02
{
    public static void main(String[] args) throws Exception
    {
        Path path = FileSystems.getDefault().getPath(Task01.FILE_NAME);
        displayFileAttributes(path);
    }

    private static void displayFileAttributes(Path path) throws Exception
    {
	String format = " Exists: %s %n" 
		+ " notExists: %s %n" 
		+ " Directory: %s %n" 
		+ " Regular: %s %n"
		+ " Executable: %s %n" 
		+ " Readable: %s %n" 
		+ " Writable: %s %n" 
		+ " Hidden: %s %n" 
		+ " Symbolic: %s %n"
		+ " Last Modified Date: %s %n" 
		+ " Size: %s %n";
		System.out.println("File info:");
		System.out.printf(format, 
			Files.exists(path, LinkOption.NOFOLLOW_LINKS),
			Files.notExists(path, LinkOption.NOFOLLOW_LINKS),
			Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS),
			Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS),
			Files.isExecutable(path),
			Files.isReadable(path),
			Files.isWritable(path),
			Files.isHidden(path),
			Files.isSymbolicLink(path),
			Files.getLastModifiedTime(path, LinkOption.NOFOLLOW_LINKS),
			Files.size(path));
	}
}