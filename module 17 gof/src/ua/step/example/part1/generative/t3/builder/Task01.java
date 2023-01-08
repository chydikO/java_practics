package ua.step.example.part1.generative.t3.builder;

import ua.step.example.part1.generative.t3.builder.model.Account;
import ua.step.example.part1.generative.t3.builder.model.Account.Builder;

/**
 * 
 * Строитель (builder). Отделяет конструирование сложного объекта от его
 * представления, так что в результате одного и того же процесса конструирования
 * могут получаться разные представления.
 * 
 */
public class Task01
{
    public static void main(String[] args)
    {
        // конструирование
        Builder builder = Account.newBuilder();
        builder.setUserId("Иванов");
        builder.setToken("3123123");
        // представление
        Account account = builder.build();
        System.out.println(account);
        // создать объекты класса можно только используя билдер
        // Account account2 = new Account();
    }
}
