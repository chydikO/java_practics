package ua.step.example.part4.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ua.step.example.model.Person;

/**
 * 
 * Чтение объекта из файла
 * 
 */
public class Task02
{
    public static void main(String[] args) throws IOException,
            ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream(Task01.FILE_NAME);
        ObjectInputStream oin = new ObjectInputStream(fis);
        Person person = (Person) oin.readObject();
        System.out.println(person);
        oin.close();
        // FIXME измените объект Person (добавте поле) и снова попробуйте
        // считать сериализованный объект
    }
}
