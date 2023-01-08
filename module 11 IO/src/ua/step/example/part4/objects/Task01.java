package ua.step.example.part4.objects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ua.step.example.model.Person;


/**
 * 
 * Запись объекта в файл
 * 
 */
public class Task01
{
	public static final String FILE_NAME = "person.out";
	
	public static void main(String[] args) throws IOException
    {
        Person person = new Person("Вася", 23);
        // сначала создаем байтовый поток
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        // потом создаем объектный поток на основе байтового потока
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // запись состояния объекта в файл
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}

