package ua.step.example.part2.bytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 
 * Буфферизированные потоки
 * 
*
 */
public class Task06 {
	public static void main(String[] args) throws IOException {
		File file = new File(ua.step.example.part1.file.system.Task01.FILE_NAME);
		if (file.exists()) {
			Random rnd = new Random();
			// запись в файл с перезаписью
			OutputStream fos = new FileOutputStream(file);
			// FIXME расскоментируй строку ниже по указанию преподователя
			//fos = new BufferedOutputStream(fos);
			long start = System.nanoTime();
			for (int i = 0; i < 1_000_000; i++) {
				fos.write(rnd.nextInt());
			}
			fos.close();
			System.out.printf("Время записи %.03f с.", (System.nanoTime() - start)/1_000_000_000f);
		} else {
			System.out.println("Запустите Task01");
		}
	}
}
