package ua.step.example.generic.model;

public class OpenBox <T> implements Opening<T>{
    private T object;
    public T get()
    {
        return object;
    }
}
