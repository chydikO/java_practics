package ua.step.example.part2.bytes;

import java.io.IOException;
import java.io.RandomAccessFile;

import ua.step.example.part1.file.system.Task01;
/**
 * 
 * Произвольный доступ
 * 
 */
public class Task07 {
	private static final int SYMBOL_NUMBER = 3;
	public static void main(String[] args) throws IOException {
		System.out.println(readFrom(SYMBOL_NUMBER));
	}
	
    // читаем файл с определенного символа
    public static String readFrom(int numberSymbol) throws IOException {
        // открываем файл для чтения
        RandomAccessFile file = new RandomAccessFile(Task01.FILE_NAME, "r");
        StringBuilder res = new StringBuilder();
 
        // ставим указатель в позицию numberSymbol
        file.seek(numberSymbol);
        int b = file.read();
 
        // побитово читаем и добавляем символы в строку
        while(b != -1){
            res.append((char)b);
            b = file.read();
        }
        file.close();
        return res.toString();
    }
}
