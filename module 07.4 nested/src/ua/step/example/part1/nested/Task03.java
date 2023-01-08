package ua.step.example.part1.nested;

import ua.step.example.part1.nested.Question.Type;

/**
 * В вопросе (класс Question) понятие "типа вопроса" (class Type) является
 * очевидным. Альтернатива - создать класс верхнего уровня QuestionType, - будет
 * менее выразительной, по крайней мере в контексте класса Question.
 */
public class Task03
{
    public static void main(String[] args)
    {
        Question question = new Question(Question.Type.TEXT);
        // Cнаружи обращение к классу Type всегда осуществляется через имя
        // обрамляющего класса - Question.Type.
        Question.Type type = question.getType();
        if (type == Question.Type.TEXT)
        {
            System.out.println("Тип вопроса текст");
        }
    }
}

class Question
{
    private Type type;

    public Question(Type type)
    {
        this.type = type;
    }

    public Type getType()
    {
        return type;
    }

    public static enum Type
    {
        SINGLE_CHOICE, MULIT_CHOICE, TEXT
    }
}