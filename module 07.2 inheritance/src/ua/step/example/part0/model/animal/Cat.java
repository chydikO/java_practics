package ua.step.example.part0.model.animal;

/**
 * 
 * В наследнике разрешен доступ ко всем полям суперкласса кроме полей с
 * модификатором доступа private
 *
 */
public class Cat extends Animal {
    // переопределение метода суперкласса
    public String sound()
    {
        return "мяу";
    }
}