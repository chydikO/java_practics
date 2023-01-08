package ua.step.example.part0.reference;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class Task04
{
    public static void main(String args[]) throws IOException
    {
      broken();
      correct();
    }

    public static FileReader recreateIt() throws IOException
    {
        File file = new File("temp.fil");
        if (!file.exists())
        {
            file.createNewFile();
        }
        return new FileReader(file);
    }

    public static void broken() throws IOException
    {
      System.out.println("Executing method broken");
      FileReader obj = recreateIt();
      Reference<FileReader> wr = new WeakReference<FileReader>(obj);

      System.out.println("wr refers to object " + wr.get());

      System.out.println("Now, clear the reference and run GC");
      //Clear the strong reference, then run GC to collect obj.
      obj = null;
      System.gc();

      System.out.println("wr refers to object " + wr.get());

      //Now see if obj was collected and recreate it if it was.
      obj = (FileReader)wr.get();
      if (obj == null)
      {
        System.out.println("Now, recreate the object and wrap it  In a WeakReference");
        wr = new WeakReference<FileReader>(recreateIt());
        System.gc();  //FileReader object is NOT pinned...there is no 
                      //strong reference to it.  Therefore, the next 
                      //line can return null.
        obj = (FileReader)wr.get();
      }
      System.out.println("wr refers to object " + wr.get());
    }

    public static void correct() throws IOException
    {
      System.out.println("");
      System.out.println("Executing method correct");
      FileReader obj = recreateIt();
      Reference<FileReader> wr = new WeakReference<FileReader>(obj);

      System.out.println("wr refers to object " + wr.get());

      System.out.println("Now, clear the reference and run GC");
      //Clear the strong reference, then run GC to collect obj
      obj = null;
      System.gc();

      System.out.println("wr refers to object " + wr.get());

      //Now see if obj was collected and recreate it if it was.
      obj = (FileReader)wr.get();
      if (obj == null)
      {
        System.out.println("Now, recreate the object and wrap it in a WeakReference");
        obj = recreateIt();
        System.gc();  //FileReader is pinned, this will not affect 
                      //anything.
        wr = new WeakReference<FileReader>(obj);
      }
      System.out.println("wr refers to object " + wr.get());
    }
}