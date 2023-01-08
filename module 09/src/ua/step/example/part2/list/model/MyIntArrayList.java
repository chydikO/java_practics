package ua.step.example.part2.list.model;

public class MyIntArrayList
{
    private int[] values;
    
    private int size;

    public static void main(String[] args)
    {
        MyIntArrayList t1 = new MyIntArrayList();
        for (int i=0; i< 11;i++)
        {
            t1.add(i);
        }
        System.out.println(t1);
    }

    public MyIntArrayList(int capacity)
    {
        values = new int[capacity];
    }

    public MyIntArrayList()
    {
        this(10);
    }

    public void add(int value)
    {
        if (size == values.length)
        {
            resize();
        }
        values[size++] = value;
    }

    private void resize()
    {
        //дописать метод 
    }

    public int get(int index)
    {
        if (index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        return values[index];
    }
}
