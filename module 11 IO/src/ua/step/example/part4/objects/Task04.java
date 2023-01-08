package ua.step.example.part4.objects;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 
 * Сериализуем объект своими силами
 *
 */
public class Task04
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        CustomPerson person = new CustomPerson("Вася", 23);
        FileOutputStream fos = new FileOutputStream(Task01.FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(Task01.FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        person = (CustomPerson) ois.readObject();
        ois.close();
        System.out.println(person);
    }
}

class CustomPerson implements /**/ Externalizable /**/
{
    private static final long serialVersionUID = 1L;

    private String name;

    private int age;

    transient private char firstLetter;

    CustomPerson(){
    	
    }
    CustomPerson(String name, int age)
    {
        this.name = name;
        this.age = age;
        if (!name.isEmpty())
        {
            this.firstLetter = name.charAt(0);
        }
    }

    public char getFirstLetter()
    {
        return firstLetter;
    }

    @Override
    public String toString()
    {
        return name + " " + age;
    }

    @Override
    public void writeExternal(ObjectOutput paramObjectOutput)
            throws IOException
    {
    	paramObjectOutput.writeUTF(name);
    	paramObjectOutput.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput paramObjectInput) throws IOException,
            ClassNotFoundException
    {
    	name = paramObjectInput.readUTF();
    	age = paramObjectInput.readInt();
    }
}