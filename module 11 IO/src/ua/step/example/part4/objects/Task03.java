package ua.step.example.part4.objects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ua.step.example.model.Student;

/**
 * 
 * Остановка сериализации объекта
 *
 */
public class Task03
{
    public static void main(String[] args) throws IOException
    {
    	// обратите внимание на реализацию методов writeObject и readObject в класса Student
    	Student person = new Student("Вася", 23, "java 1"); 
        FileOutputStream fos = new FileOutputStream("student.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}

